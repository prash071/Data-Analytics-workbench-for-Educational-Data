from django.conf.urls import patterns, include, url
from testex.views import *
from testex.search1 import *
from testex.visual import *
from django.contrib import admin
from testex import *
admin.autodiscover()


urlpatterns = patterns('',
    # Examples:
    # url(r'^$', 'testex.views.home', name='home'),
    # url(r'^blog/', include('blog.urls')),
    url(r'^admin/', include(admin.site.urls)),
    url(r'^hello/$', "testex.views.hello"), 
    url(r'^hello1/$', "testex.views.current_datetime1"),
    url(r'^time/plus/(\d{1,2})/$', hours_ahead),	
    url(r'^$', "testex.views.temp"),
    url(r'^x/$', "testex.views.search_form"),
    url(r'^search/', "testex.views.search"),
    url(r'^search_data/', "testex.search1.search_d"), 
    url(r'^search_new/', "testex.search1.search_new"), 	
    url(r'^page1/', "testex.visual.page1"),
    url(r'stdenrolled', "testex.visual.stdenrolled"),
    url(r'^visualization/', "testex.visual.visual"), 
    url(r'^visualization/page1', "testex.visual.page1"),
    url(r'^visual/check', "testex.visual.check"), 
    url(r'^v1', "testex.visual.v1"),  
    url(r'^ch', "testex.automater.ch"), 
    url(r'^loading/', "testex.visual.load"),
    url(r'^submit1/', "testex.visual.submit1"), 
    url(r'^js1/', "testex.visual.js1"),
    url(r'^js2/', "testex.visual.js2"),
    url(r'^js3/', "testex.visual.js3"),
    url(r'^js4/', "testex.visual.js4"),
    url(r'^js5/', "testex.visual.js5"),
    url(r'^js6/', "testex.visual.js6"),
    url(r'^js7/', "testex.visual.js7"),
    url(r'^js8/', "testex.visual.js8"),
    url(r'^js9/', "testex.visual.js9"),
    url(r'^js10/', "testex.visual.js10"),
    url(r'^js11/', "testex.visual.js11"),
    #url(r'^print_status', "testex.visual.print_status"), 
    #url(r'^automater/', "testex.automater.main"), 
    url(r'visual/graphs/', "testex.visual.graphs"), 
    url(r'visual/task_in_progress/', "testex.visual.task_in_progress"),
    url(r'^django-rq/', include('django_rq.urls')), 	
    url(r'visual/load/', "testex.automater.load"),
    url(r'^automater/r/', "testex.automater.r"),
    url(r'print_status/', "testex.automater.print_status"), 
    url(r'^success/','testex.t.success'),
    url(r'^say_hello/','testex.t.say_hello'),
#    url(r'^rp/','testex.rp.rp'),

)
