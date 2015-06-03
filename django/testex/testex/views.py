from django.http import HttpResponse
from django.template import Template, Context
from django.shortcuts import render
# for returning render this is required
import datetime

def search_form(request):
    now = datetime.datetime.now()
    fp=open("/home/purva/iitb_intern/django/templates/template1.html")
    t=Template(fp.read())
    fp.close()  
    html = t.render(Context({'current_date': now})) 
    return HttpResponse(html)
    #return render(request, '/home/purva/iitb_intern/django/templates/template1.html')


def temp(request):
     t = Template('My name is  name .')
#c = template.Context({'name': 'Adrian'})
     return HttpResponse("cvbdfbfdx")

def hello(request):
    fp=open("/home/purva/iitb_intern/django/templates/template1.html")
    t=Template(fp.read())
    fp.close()  
    html = t.render(Context({'current_date': now})) 
    return HttpResponse(html)
def search(request):
    error = False
    if 'q' in request.GET:
        q = request.GET['q']
        if not q:
            error = True
        else:
            
            return render(request, 'template1.html',
                {'query': q})
    return render(request, 'template1.html',
        {'error': error})

def current_datetime(request):
    now = datetime.datetime.now()
    t = Template("<html><body>It is now {{ current_date }}.</body></html>")
    html = t.render(Context({'current_date': now}))
    # end 1
    #html = "<html><body>It is now %s.<input type='submit'></body></html>" % now
    # end 2
    # t1=Template("<html><body>{% include '/home/purva/iitb_intern/django/templates/template1.html' %}</body>	</html>")
    return HttpResponse(t)

def current_datetime1(request):
    now = datetime.datetime.now()
    fp = open('/home/purva/iitb_intern/django/templates/template1.html')
    t = Template(fp.read())
     
    fp.close()
    html = t.render(Context({'current_date': now}))
    return HttpResponse(html)

def hours_ahead(request, offset):
    try:
        offset = int(offset)
    except ValueError:
        raise Http404()
    dt = datetime.datetime.now() + datetime.timedelta(hours=offset)
    html = "<html><body>In %s hour(s), it will be %s.</body></html>" % (offset, dt)
    return HttpResponse(html)

