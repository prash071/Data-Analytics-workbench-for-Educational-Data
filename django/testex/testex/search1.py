from django.http import HttpResponse
from django.template import Template, Context
from django.shortcuts import render
# for returning render this is required
import datetime
import csv

def search_d(request):
        if 'q' in request.GET:
        	q = request.GET['q']
	
        fp=open("templates '/template1.html'")
        t=Template(fp.read())
    	 
    	html = t.render(Context({'current_date':'d'})) 
    	return HttpResponse(html)
def search_new(request):
    	error = []
    	if 'q' in request.GET:
        	q = request.GET['q']
        	if not q:
            		error.append("invalid data")
        	else:
			fp=open("/home/purva/iitb_intern/django/testex/testex/templates/template4.html")
        		t=Template(fp.read())
    	 
    			html = t.render(Context({'current_date':'ghj'})) 
                        fp.close() 
    			return HttpResponse(html)            	   	
			#return render(request, '/home/purva/iitb_intern/django/templates/template1.html',{'query': q})
        fp=open("/home/purva/iitb_intern/django/testex/testex/templates/template4.html")
        t=Template(fp.read())
    	 
    	html = t.render(Context({'errors':error})) 
        return HttpResponse(html) 
    	#return render(request, '/home/purva/iitb_intern/django/templates/template1.html',{'error': error})

