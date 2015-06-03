# Modules
from __future__ import unicode_literals
from socket import *
from servermodules import *
from localmodules import *
from django.http import HttpResponse,HttpResponseRedirect
from django.template import Template, Context
from django.shortcuts import render,redirect
from django.core.urlresolvers import reverse
# for returning render this is required
import datetime
import subprocess
import csv
import redis
from django_rq import get_queue
from rq import use_connection, Queue,get_current_job
#from testex.visual import *
from rq.job import Job
from visual import page1
import time
from redis import Redis
def ch(request):
	v="sqoop import --connect jdbc:mysql://localhost/edxapp --username root --password root123 --table auth_user --hive-import --hive-database localdb"
	run_bash(v)
def r(request):
	if(request.method=="POST"):
		path=request.POST.get('path','~')
		mode=request.POST.get('mode','upload')
		server=request.POST.get('server','amazonserver')
		username=request.POST.get('username','')
		password=request.POST.get('password','')
		use_connection()
		queue=Queue(connection=Redis())
		y=queue.enqueue_call(func=main,args=(path,mode,server,username,password,),timeout=500)
		x=y.id
        #z=print_status()
		job=Job().fetch(x)
		time.sleep(4)
		z=1
		while z:
			if(job.is_finished):
				return render(request, 'print_status.html', {'question': 'question'})
			elif(job.is_failed):
				return HttpResponse("failed")
			
				
		#return HttpResponse("yeah")
	#url=reverse('print_status',args=(),kwargs={'id1':x})
	return HttpResponseRedirect("url")

def print_status(request,id1):
        #id2=request.GET.get(id1,"")
        #x=id1.id
    	#use_connection()
    	#queue=Queue(connection=Redis())
    	job=Job().fetch(id1)
    	if(job.is_finished):
    		return HttpResponseRedirect(reverse("done",args=(id2,)))
    	elif(job.is_failed):
    		return HttpResponse("failed")
    	else:
    		return render(request,print_status.html,{'id':id1})

def port_checker(port):
    sock = socket(AF_INET, SOCK_STREAM)
    result = sock.connect_ex(('localhost', int(port)))
    return (1 - result)


#def check_connectivity():
#    hadoop_port = 9000
#    hiveserver_port = 10000
    #derby_port = 1527NameError: global name 'HttpsResponse' is not defined

#    prob_flag = 0
#    port_dict = {'hadoop': port_checker(9000), 'hiveserver2': port_checker(10000),
 #                'derby server': port_checker(1527), 'NameNode': port_checker(50070), 'DataNode': port_checker(50075),
  #               'Secondary Namenode': port_checker(50090)}
  #  for key in port_dict:
   #     if (port_dict[key] != 1):
    #        print "Connection Problem in " + key
     #       prob_flag += 1
    #return prob_flag


def main(path,mode,server,username,password):
    #if (check_connectivity() != 0):
     #   return HttpsResponse("Restart Script After Correcting Connection Errors")
      #  exit()
    if (server == "usage"):
       return HttpResponse("""
            Usage:
            python automater.py amazonserver <mode> <dir-of-edxData>
            mode = upload/update
                OR
            python automater.py local <mode> <mysqluser> <mysqlpassword> <dir-of-localData>
                OR
            python automater.py reset
            """)
       exit()
    elif (server == "amazonserver"):
        if (mode == "upload"):
            src = os.path.expanduser(path)
            uploader(src)
        elif (mode == "update"):
            src = os.path.expanduser(path)
            updater(src)
    elif (server == "local"):
        if (mode == "upload"):
            localupload(username, password, os.path.expanduser(path))
        elif (mode == "update"):
            pass
    elif (server == "reset"):
        run_script(FS_RESET)
        run_script(HDFS_RESET)
        localReset()
        dpReset()
        # localReset()
    else:
        print "Incorrect arguements provided"
        run_bash("rm -rf /home/hduser/separate-data")

def load(request):
	queue=get_queue()
	queue.enqueue(main)
	return HttpResponse("loading goin")

#if __name__ == '__main__':
#    main()
