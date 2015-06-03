#Modules
from __future__ import unicode_literals
from servermodules import *
from localmodules import *
from django.http import HttpResponse,HttpResponseRedirect
from django.template import Template, Context
from django.shortcuts import render

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
def r(request):
	if(request.method=="GET"):
		path=request.GET.get('path','/home/hduser')
		mode=request.GET.get('mode','upload')
		server=request.GET.get('server','amazonserver')
		username=request.GET.get('username','')
		password=request.GET.get('password','')
		use_connection()
		queue=Queue(connection=Redis())
		y=queue.enqueue(main,path,mode,server,username,password)
		#x=print_status(y.key)
		#y=queue.enqueue(add,5,4)
		x=y.id
		#print type(x)
		#print_status(x)
		#time.sleep(5)
		#return HttpResponse(y.result)
		job=Job().fetch(x)
		time.sleep(4)
		z=1
		while z:
			if(job.is_finished):
				return render(request, 'visualization.html', {'question': question})
			elif(job.is_failed):
				return HttpResponse("failed")
			#else:
			#	return render(request,'ex.html', {'x': x})
				
		return HttpResponse("yeah")
	return HttpResponse("not allowed to access")
def print_status(request):
	use_connection()
	queue=Queue(connection=Redis())
	id1=request.GET.get("x","")	
	return id1
	job=Job.fetch(id1)
	return job.result
	if(job.is_finished):
		return "completed loading"
	elif(job.is_failed):
		return "failed"
	else:
		return render(request,'ex.html', {'x': x}) 
def main(path,mode,server,username,password):
		
	if(server == "usage"):
		print "Usage:"
		print "python automater.py amazonserver <mode> <dir-of-edxData>"
		print "mode = upload/update"
		print "OR"
		print "python automater.py local <mode> <mysqluser> <mysqlpassword> <dir-of-localData>"
		exit()
	elif(server == "amazonserver"):
		if(mode == "upload"):	
			src = os.path.expanduser(path)
			uploader(src)
		elif(mode == "update"):
			src = os.path.expanduser(path)
			updater(src)
	elif(server == "local"):
		if(mode == "upload"):	
			localupload(username,password,os.path.expanduser(mode))
		elif(mode == "update"):
			pass
	else:
		print "Incorrect arguements provided"
	run_bash("rm -rf /home/hduser/separate-data")
	#return HttpResponseRedirect('visual/graphs')
	print "mode:"+ mode	
	return mode+server+username+password+path
	
def add(x,y):
	z=0
	while z<100:
		x=x+y
		y=x+y
		z=z+1
	return x
def load(request):
	queue=get_queue()
	queue.enqueue(main)
	return HttpResponse("loading goin")
#if __name__=='__main__':
#	main()

