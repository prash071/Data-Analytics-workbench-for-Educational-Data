from django.http import HttpResponse
from django.template import Template, Context
from django.template import *
from django.shortcuts import render
from django.http import HttpResponseRedirect
# for returning render this is required
import datetime
from django.template.loader import get_template
import csv
from django.core.context_processors import csrf
from django.shortcuts import render_to_response
import subprocess
from testex import *
from testex.helperModules import *
from testex.connector import *
from testex.helperModules import *
import time
from django.templatetags import *
from django.template.base import Library
from django.conf import settings
from itertools import izip


def page1(request):
    return render(request, 't1.html', {'currentdate': "sdf"})


def v1(request):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    years = execute(c, "select distinct year(time) as year from log_table where year(time) is not null")[
        "year"].tolist()
    c.close()
    return HttpResponse(years)


def visual(request):
    years = getYears()
    courses1 = getCoursesAndYears()
    x = zip(courses1[0], courses1[1])
    studq = []
    studq.append("age distribution chart")
    studq.append("Student Marks Statistics")
    studq.append("degree distribution")
    vidq = []
    vidq.append("User activity")
    vidq.append("event sequence")
    enrollq = []
    enrollq.append("student enrolled throughout the country")
    probq = []
    probq.append("Response Time by Course")
    vid1q = []
    vid1q.append("Videos watched")
    vid1q.append("Statistics showing the number of students who have jumped the video")
    vid1q.append("Changes in video speed")
    vid1q.append("Showing the users who have used transcript")
    v1 = []
    for i in range(32):
        if i != 0:
            if i < 10:
                v1.append("0" + str(i))
            else:
                v1.append(i)
    v2 = []
    for i in range(13):
        if i != 0:
            if i < 10:
                v2.append("0" + str(i))
            else:
                v2.append(i)
    v3 = []
    v3.append("2014")
    return render(request, 'visualization.html',
                  {'v1': v1, 'v2': v2, 'v3': v3, 'year': years, 'course': x, 'vid1q': vid1q, 'studq': studq,
                   'vidq': vidq, 'enrollq': enrollq, 'probq': probq},context_instance=RequestContext(request) )


def load(request):
    return render(request, 'load.html', {'currentdate': "sdf"})


def submit1(request):
    w = request.GET.get('path', '~')
    output = subprocess.check_output([
        "python",
        "/home/hduser/django/testex/hiveedximporter/automater3.py",
        request.GET['mode'],
        request.GET['path']
    ])
    return HttpResponse(request.GET['server']);


def check(request):
    years = getYears()
    courses1 = getCoursesAndYears()
    x = zip(courses1[0], courses1[1])
    studq = []
    studq.append("age distribution chart")
    studq.append("Student Marks Statistics")
    studq.append("degree distribution chart")
    vidq = []
    vidq.append("User activity")
    vidq.append("event sequence")
    enrollq = []
    enrollq.append("student enrolled throughout the country")
    probq = []
    probq.append("Response Time by Course")
    vid1q = []
    vid1q.append("Videos watched")
    vid1q.append("Statistics showing the number of students who have jumped the video")
    vid1q.append("Changes in video speed")
    vid1q.append("Showing the users who have used transcript")
    v1 = []
    for i in range(32):
        if i != 0:
            if i < 10:
                v1.append("0" + str(i))
            else:
                v1.append(i)
    v2 = []
    for i in range(13):
        if i != 0:
            if i < 10:
                v2.append("0" + str(i))
            else:
                v2.append(i)
    v3 = []
    v3.append("2014")
    if (request.method == "POST"):

        if 'studentb' in request.POST:
            stq = request.POST.get("studentq", "1")
            sty = request.POST.get("studentyear", "2014")
            stc = request.POST.get('studentcourse', 'Summer_Intern_IIT_Mumbai/SI003/2014_SI_May')
            if stq == "0":
                ageDistributionByCourse(stc)
                file1 = "agedistro.html"
                time.sleep(3)
            elif stq == "1":
                studentMarkStats(stc)
                file1 = "marks.html"
            else:
                degreeDistributionByCourse(stc)
                file1 = "degreedist.html"
            time.sleep(4)
            return render(request, 'visualstudent.html',
                          {'v1': v1, 'v2': v2, 'v3': v3, 'year': years, 'course': x, 'vid1q': vid1q,
                           'studq': studq, 'vidq': vidq, 'enrollq': enrollq, 'probq': probq, 'temp': file1},
                          context_instance=RequestContext(request))
        elif 'enrollb' in request.POST:
            enq = request.POST.get("enrollq", "1")
            eny = request.POST.get("enrollyear", "1")
            enc = request.POST.get("enrollcourse", "Summer_Intern_IIT_Mumbai/SI003/2014_SI_May")
            #if enq == "0":
            #    studentsin(enc)
            #    file1 = "studentsins.html"
            #else:
            ip2location()
            file1 = "worldmap-template.html"
            time.sleep(2)
            return render(request, 'visualenroll.html',{'v1': v1, 'v2': v2, 'v3': v3, 'year': years, 'course': x, 'vid1q': vid1q,'studq': studq, 'vidq': vidq, 'enrollq': enrollq, 'probq': probq, 'temp': file1},context_instance=RequestContext(request))
        elif 'video1b' in request.POST:
            vi1q = request.POST.get("video1q", "1")
            vi1y = request.POST.get("video1year", "2014")
            vi1c = request.POST.get("video1course", "Summer_Intern_IIT_Mumbai/SI003/2014_SI_May")
            if vi1q == "0":
                flag=byvideosvideowatched(vi1c)
                file1 = "videoviews.html"
                if(flag==1):
                	return render(request,"oops.html",{})
                time.sleep(3)
            elif vi1q == "1":
                flag=jump(vi1c)
                file1 = "videosjumped.html"
                if(flag==1):
                	return render(request,"oops.html",{})
            elif vi1q == "2":
                flag=speed_change(vi1c)
                file1 = "speedincrease.html"
                if(flag==1):
                	return render(request,"oops.html",{})
            else:
                flag=used_transcript(vi1c)
                file1 = "usedtranscript.html"
                if(flag==1):
                	return render(request,"oops.html",{})
            time.sleep(5)
            #return HttpResponse(vi1q + vi1c)
            return render(request, 'visualvideo.html',
                          {'v1': v1, 'v2': v2, 'v3': v3,'year': years, 'course': x, 'vid1q': vid1q,
                           'studq': studq, 'vidq': vidq, 'enrollq': enrollq, 'probq': probq, 'temp': file1},
                          context_instance=RequestContext(request))
        elif 'videob' in request.POST:
            viq = request.POST.get("videoq", "1")
            viy = request.POST.get("videoyear", "1")
            vic = request.POST.get("videocourse", "Summer_Intern_IIT_Mumbai/SI003/2014_SI_May")
            t1d = request.POST.get("t1d", "01")
            t1m = request.POST.get("t1m", "01")
            t1y = request.POST.get("t1y", "2014")
            t2d = request.POST.get("t2d", "01")
            t2m = request.POST.get("t2m", "01")
            t2y = request.POST.get("t2y", "2014")
            t1 = t1y + "-" + t1m + "-" + t1d + " 00:00:00"
            t2 = t2y + "-" + t2m + "-" + t2d + " 00:00:00"
            if viq == "0":
                activityGraphByCourse(vic, t1, t2)
                file1 = "useractivity.html"
            else:
                seqGraphByCourse(vic, t1, t2)
                file1 = "eventsequence.html"
                time.sleep(7)
            time.sleep(5)
            return render(request, 'visualcourse.html',
                          {'v1': v1, 'v2': v2, 'v3': v3, 'year': years, 'course': x, 'studq': studq, 'vid1q': vid1q,
                           'vidq': vidq, 'enrollq': enrollq, 'probq': probq, 'temp': file1},
                          context_instance=RequestContext(request))
        elif 'problemb' in request.POST:
            prq = request.POST.get("problemq", "1")
            pry = request.POST.get("problemyear", "2014")
            prc = request.POST.get("problemcourse", "Summer_Intern_IIT_Mumbai/SI003/2014_SI_May")
            responseTimesByCourse(prc)
            file1 = "responsetime.html"
            time.sleep(8)
            return render(request, 'visualproblem.html',
                          {'v1': v1, 'v2': v2, 'v3': v3, 'year': years, 'course': x, 'vid1q': vid1q,
                           'studq': studq, 'vidq': vidq, 'enrollq': enrollq, 'probq': probq, 'temp': file1},
                          context_instance=RequestContext(request))
        else:
            return HttpResponse("invalid response")
    return HttpResponse("not using post")


def stdenrolled(request):
    courses1 = getCoursesAndYears()
    x = zip(courses1[0], courses1[1])
    if request.method == "POST":
        i = studentStaffInfoByCourse(request.POST.get("c", ""))
        list_enroll = zip(i[0], i[1], i[2])
        return render(request, "studentenrolled.html", {'x': '0', 'courses': x, 'list_enroll': list_enroll})

    return render(request, "studentenrolled.html", {'x': '1', 'courses': x})


def js1(request):
    return render(request, 'degreedist.html', {'currentdate': "sdf"})


def js2(request):
    return render(request, 'agedistro.html', {'currentdate': "sdf"})


def js3(request):
    return render(request, 'agedistro_pie.html', {'currentdate': "sdf"})


def js4(request):
    return render(request, 'index.html', {'currentdate': "sdf"})


def js5(request):
    return render(request, 'marks.html', {'currentdate': "sdf"})


def js6(request):
    return render(request, 'mfdistro.html', {'currentdate': "sdf"})


def js7(request):
    return render(request, 'prob_id.html', {'currentdate': "sdf"})


def js8(request):
    return render(request, 'responsetime.html', {'currentdate': "sdf"})


def js9(request):
    return render(request, 'degreedist.html', {'currentdate': "sdf"})


def js10(request):
    return render(request, 'useractivity.html', {'currentdate': "sdf"})


def js11(request):
    return render(request, 'eventsequence.html', {'currentdate': "sdf"})


def graphs(request):
    return render(request, "new1/data_upload.html", {'current': 'asd'})


def task_in_progress(request, task_in_queue_id):
    task = get_task_from_queue(id)
    if task.is_comlete():
        HttpResponseRedirect(reverse('task_completed', args=(task_in_queue_id,)))
    return HttpResponse("task in prog")
