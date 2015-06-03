# import rpy2.robjects as robjects
import sys
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
from rq import use_connection, Queue
#from testex.visual import *
from visual import page1
#import rpy2.robjects.lib.ggplot2 as ggplot2
import rpy2.robjects as ro
from rpy2.robjects.packages import *
from rpy2.robjects import *
def rp(request):
	print rpy2.__version__
	r = robjects.r
	x = robjects.IntVector(range(10))
	y = r.rnorm(10)
	r.X11()
	r.layout(r.matrix(robjects.IntVector([1,2,3,2]), nrow=2, ncol=2))
	r.plot(r.runif(10), y, xlab="runif", ylab="foo/bar", col="red")
   	#pp = ggplot2.ggplot(mtcars) + \
    	#ggplot2.aes_string(x='wt', y='mpg', col='factor(cyl)') + \
     	#ggplot2.geom_point() + \
     	#ggplot2.geom_smooth(ggplot2.aes_string(group = 'cyl'),   method = 'lm')
	#pp.plot()
	h=r.library("rJava")
	m=r.library("RHive")
	rhive.init()
	#r.RHive.query("show tables")
	return HttpResponse(h)

