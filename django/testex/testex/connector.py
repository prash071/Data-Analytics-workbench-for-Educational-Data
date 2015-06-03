from helperModules import *
import csv
from dateutil import parser
import pygeoip
from django.http import HttpResponse
from django.template import Template, Context
from django.shortcuts import render
from django.http import HttpResponseRedirect

def main():
    print "Main Code"
    eventCategorizationByCourse("Summer_Intern_IIT_Mumbai/SI003/2014_SI_May")
    #studentMarkStats("Summer_Intern_IIT_Mumbai/SI003/2014_SI_May")
    #butionByCourse("Summer_Intern_IIT_Mumbai/SI001/2014_SI_May")
    #getCoursesByYear("2014")

def start_date():
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    date = cur.execute(c,"select course_id, min(time) as start_date from log_table where course_id!='NULL' and course_id!='' group by course_id")
    c.close()

def countvideobyuser(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    ans = execute(c,
                  "select username,count(*) as videos_watched from vi_log_table where event_type='play_video' and course_id='" + course + "' group by username")
    ans.to_csv("/home/hduser/django/testex/testex/static/byuser_videos_watched.tsv", sep="\t")
    c.close()

## how many users have jumped through the videos
def jump(course):
    try:
        c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    except:
        return HttpResponse("connection problem")  
    try:      
        ans = execute(c,
                  "select id,count(distinct(username)) as jumps from vi_log_table where event_type='seek_video' and course_id='" + course + "' group by id")
        ans.to_csv("/home/hduser/django/testex/testex/static/videosjumped.tsv", sep="\t")
    except ValueError:
        return 1    
    c.close()
    return 0

## how many students have changed(increased) the video speed
def speed_change(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        ans = execute(c,
                  "select id,count(distinct(username)) as count from vi_log_table where event_type='speed_change_video' and (old_speed < new_speed) and course_id='" + course + "' group by id")
        ans.to_csv("/home/hduser/django/testex/testex/static/speedincrease.tsv", sep="\t")
    except ValueError:
           return 1
    c.close()
    return 0

## how many users used transcript to understand the video
def used_transcript(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        ans = execute(c,
                  "select id,count(distinct(username)) as transcript from vi_log_table where event_type='show_transcript' and course_id='" + course + "' group by id")
        ans.to_csv("/home/hduser/django/testex/testex/static/usedtranscript.tsv", sep="\t")
    except ValueError:
        return 1
    c.close()
    return 0

## number of views of a particular video (only the videos that have been watched atleast once)
def byvideosvideowatched(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        ans = execute(c,"select id,count(username) as views from vi_log_table where event_type='play_video' and course_id='" + course + "' group by id")
        ans.to_csv("/home/hduser/django/testex/testex/static/videoviews.tsv", sep="\t")
    except ValueError:
        return 1
    c.close()
    return 0

## graph between currentTime(time for which a particular video was watched) vs student_id
def currenttime_students(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    ans = execute(c,
                  "select id,distinct user_id,max(currentTime) from vi_log_table where event_type in ('play_video','pause_video') and course_id='" + course + "' group by id")
    ans.to_csv("/home/hduser/django/testex/testex/static/time_watched.tsv", sep="\t")
    c.close()

def studentStaffInfoByCourse(course):
    """Returns Information about Students and Staff in Name:EmailID:UserID Format"""
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    students = execute(c,'select auth_user.username,auth_user.email,auth_user.id from auth_user join (select distinct student_id from courseware_studentmodule where courseware_studentmodule.course_id="' + course + '" order by student_id)userids on auth_user.id=userids.student_id where auth_user.is_staff=false')
    return [students["username"].tolist(),students["id"].tolist(),students["email"].tolist()]


def ip2location():
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "amazonserver")
    ip = execute(c, "select ip from log_table")["ip"].tolist()
    g = pygeoip.GeoIP('/home/hduser/django/testex/testex/static/GeoLiteCity.dat')
    country = []
    temp = DataFrame(columns=["country", "code"])
    a = pandas.io.parsers.read_csv("/home/hduser/django/testex/testex/static/country_latlon.csv")
    print list(a.columns.values)
    for i in ip:
        try:
            x = g.record_by_addr(i)["country_name"]
            y = g.record_by_addr(i)["country_code"]
            country.append(x)
        except:
            print "Invalid ip " + str(i)
        temp.loc[temp.shape[0]] = [x, y]
    myset = list(set(country))
    print myset
    df = DataFrame(columns=["country", "code", "count"])
    ans = DataFrame(columns=["country", "code", "count", "latitude", "longitude"])
    for i in range(len(myset)):
        c = 0
        countries = np.array(temp["country"].tolist())
        c = sum(countries==myset[i])
        w = (temp[temp.country==myset[i]]["code"].tolist())[0]
        df.loc[df.shape[0]] = [myset[i], w, c]
    print df
    print a[1:10]
    for i in range(df.shape[0]):
        for j in range(a.shape[0]):
            if df.ix[i]["code"] == a.ix[j]["code"]:
                ans.loc[ans.shape[0]] = [df.ix[i]["country"], df.ix[i]["code"], df.ix[i]["count"], a.ix[j]["latitude"],a.ix[j]["longitude"]]
                break
    print ans
    ans.to_csv("/home/hduser/django/testex/testex/static/worldmap.csv")

def responseTimesByCourse(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    pids_time = DataFrame(columns=["username", "course", "pid", "timeinsecs"])
    try:
        users_course = execute(c, 'select distinct username from pi_log_table where course_id="' + course + '"')["username"].tolist()
        print users_course
        qna_course = execute(c,'select username,event_type,pid,course_id,time from (select username,event_type,time,split(split(split(path,"\\;")[5],"_")[1],"/")[0] as pid,course_id from pi_log_table where ' +
                                 'course_id="' + course + '" and ((event_type="problem_check" and submission is not null and attempts=1) or event_type="problem_get") order by username,time)a')
        for user in users_course:
                qna = qna_course[qna_course.username == user].reset_index()
                for i in range(1, qna.shape[0]):
                    if qna.ix[i]["event_type"] == "problem_check" and qna.ix[i - 1]["event_type"] == "problem_get":
                        setTime = parser.parse(qna.ix[i - 1]["time"])
                        nowTime = parser.parse(qna.ix[i]["time"])
                        pids_time.loc[pids_time.shape[0]] = [user,course,qna.ix[i]["pid"],(nowTime - setTime).seconds]
                    elif qna.ix[i]["event_type"] == "problem_check" and qna.ix[i - 1]["event_type"] == "problem_check":
                        setTime = parser.parse(qna.ix[i - 1]["time"])
                        nowTime = parser.parse(qna.ix[i]["time"])
                        pids_time.loc[pids_time.shape[0]] = [user,course,qna.ix[i]["pid"],(nowTime - setTime).seconds]
        pids_time.to_csv("/home/hduser/django/testex/testex/static/responseTimes.tsv",sep="\t")
    except ValueError:
        return 1
    c.close()
    return 0        

def studentsin(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    num_users = execute(c,"select count(distinct username) from log_table where course_id='" + course + "'")
    c.close()
    return num_users


def eventCategorizationByCourse(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    num_users = studentsin("Summer_Intern_IIT_Mumbai/SI003/2014_SI_May")
    piEvents = execute(c,"select username,count(*) as event_num from pi_log_table where event_type='problem_check' and course_id='" + course + "' group by username")
    maxpiEvents = max(piEvents["event_num"].tolist())
    piEvents = piEvents["event_num"]
    print piEvents["event_num"].tolist()


def logins():
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    logins = execute(c,
                     'select username,session,min(time) as tim from log_table where session is not null and username!="" and username is not null group by username,session order by tim')
    logins.to_csv("/home/hduser/django/testex/testex/static/logins.tsv", sep="\t")
    c.close()

def logouts():
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    logouts = execute(c,
                      'select username,session,max(time) as tim from log_table where session is not null  and username!="" and username is not null group by username,session order by tim')

def mfrByCourse(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        subQ = "(select username,user_id,course_id as c_id,split(split(split(path,'\\;')[5],'_')[1],'/')[0] as q_id,split(split(submission,'input_type\":\"')[1],'\",\"')[0] as q_type,split(split(submission,'question\":\"')[1],'\",\"')[0] as q,split(split(submission,'response_type\":\"')[1],'\",\"')[0] as a_type,case when split(split(submission,'response_type\":\"')[1],'\",\"')[0]=\"multiplechoiceresponse\"    then split(split(split(split(submission,'\\\\\\{\"')[2],'\\\\\\}')[0],'answer\":\"')[1],'\",\"')[0] when split(split(submission,'response_type\":\"')[1],'\",\"')[0]=\"choiceresponse\" then split(split(split(split(submission,'\\\\\\{\"')[2],'\\\\\\}')[0],'answer\":\\\\\\[')[1],'\\\\\\],')[0] end as a, split(split(submission,'correct\":')[1],'}')[0] as check from pi_log_table where submission is not null and course_id='" + course + "' and event_type=\"problem_check\")a"
        mfr = execute(c, "select a.c_id,auth_userprofile.gender,count(distinct a.username) from " + subQ +
                      ' join auth_userprofile on a.user_id=auth_userprofile.user_id where auth_userprofile.gender!="NULL" and auth_userprofile.gender!="" group by auth_userprofile.gender,a.c_id')
        mfr.to_csv("mfr.csv")
    except ValueError:
        return 1    
    c.close()
    return 0

def getYears():
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    years = execute(c,"select distinct year(time) as year from log_table where year(time) is not null")["year"].tolist()
    c.close()
    return years

def getCoursesAndYears():
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    courses_year = execute(c,"select course_id as course_id,year(min(time)) as time from log_table where course_id is not null and course_id!='' group by course_id")
    c.close()
    return [courses_year["course_id"].tolist(),courses_year["time"].tolist()]    

def getCoursesByYear(year):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    courses_year = execute(c,"select course_id,min(time) from log_table where course_id is not null and course_id!='' and year(time)='" + year + "' group by course_id")
    c.close()
    return courses_year


def getUsersByCourse(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    users_course = execute(c, 'select distinct username from pi_log_table where course_id="' + course + '" where username is not null and username!=""')["username"].tolist()

def ageDistributionByCourse(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        usersSubQ = '(select distinct user_id from log_table where course_id="' + course + '" and username is not null and username!="")users'
        agesPC = DataFrame(columns=["range", "number"])
        ageDis = execute(c,
                         'select users.user_id,(year(from_unixtime(unix_timestamp())) - auth_userprofile.year_of_birth) as age from ' + usersSubQ + ' join auth_userprofile on auth_userprofile.user_id=users.user_id')
        for i in range(4):
            agesPC.loc[agesPC.shape[0]] = [str(i * 20) + "-" + str((i + 1) * 20), len(
                ageDis[(ageDis.age > i * 20) & (ageDis.age <= ((i + 1) * 20))]["age"].tolist())]
        ageDis.to_csv("/home/hduser/django/testex/testex/static/ageDis.tsv", sep="\t")
        agesPC.to_csv("/home/hduser/django/testex/testex/static/ageDisPC.tsv", sep="\t")
    except ValueError:
        return 1        
    c.close()
    return 0

def qnaRWStats(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        subQ = "(select username,user_id,course_id as c_id,split(split(split(path,'\\;')[5],'_')[1],'/')[0] as q_id,split(split(submission,'input_type\":\"')[1],'\",\"')[0] as q_type,split(split(submission,'question\":\"')[1],'\",\"')[0] as q,split(split(submission,'response_type\":\"')[1],'\",\"')[0] as a_type,case when split(split(submission,'response_type\":\"')[1],'\",\"')[0]=\"multiplechoiceresponse\"    then split(split(split(split(submission,'\\\\\\{\"')[2],'\\\\\\}')[0],'answer\":\"')[1],'\",\"')[0] when split(split(submission,'response_type\":\"')[1],'\",\"')[0]=\"choiceresponse\" then split(split(split(split(submission,'\\\\\\{\"')[2],'\\\\\\}')[0],'answer\":\\\\\\[')[1],'\\\\\\],')[0] end as a, split(split(submission,'correct\":')[1],'}')[0] as check from pi_log_table where submission is not null and event_type=\"problem_check\")a"
        courseInfo = execute(c, "select username,q_id,check from " + subQ + ' where q is not null and c_id="' + course + '" order by q_id')
        probs_course = unique(courseInfo["q_id"].tolist())
        corrStats = DataFrame(columns=["prob_id", "correct", "incorrect"])
        for prob in probs_course:
            corrVect = boolVect(courseInfo[courseInfo.q_id == prob]["check"].tolist())
            corr = sum(corrVect)
            corrStats.loc[corrStats.shape[0]] = [prob, corr, len(corrVect) - corr]
        corrStats.to_csv("/home/hduser/django/testex/testex/static/qnaRWStats.csv")
    except ValueError:
        return 1        
    c.close()
    return 0

def studentMarkStats(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        subQ = "(select username,user_id,course_id as c_id,split(split(split(path,'\\;')[5],'_')[1],'/')[0] as q_id,split(split(submission,'input_type\":\"')[1],'\",\"')[0] as q_type,split(split(submission,'question\":\"')[1],'\",\"')[0] as q,split(split(submission,'response_type\":\"')[1],'\",\"')[0] as a_type,case when split(split(submission,'response_type\":\"')[1],'\",\"')[0]=\"multiplechoiceresponse\"    then split(split(split(split(submission,'\\\\\\{\"')[2],'\\\\\\}')[0],'answer\":\"')[1],'\",\"')[0] when split(split(submission,'response_type\":\"')[1],'\",\"')[0]=\"choiceresponse\" then split(split(split(split(submission,'\\\\\\{\"')[2],'\\\\\\}')[0],'answer\":\\\\\\[')[1],'\\\\\\],')[0] end as a, split(split(submission,'correct\":')[1],'}')[0] as check from pi_log_table where submission is not null and event_type=\"problem_check\")a"
        print course
        courseInfo = execute(c, "select username,q_id,check from " + subQ + ' where q is not null and c_id="' + course + '" order by q_id')
        print courseInfo
        users_course = unique(courseInfo["username"].tolist())
        marksStats = DataFrame(columns=["username", "marks"])
        for user in users_course:
            corrVect = boolVect(courseInfo[courseInfo.username == user]["check"].tolist())
            corr = sum(corrVect)
            marksStats.loc[marksStats.shape[0]] = [user,corr]
        marksStats.to_csv("/home/hduser/django/testex/testex/static/marks.tsv",sep="\t")
    except ValueError:
        return 1    
    return 0    
#Non Log Basic Info
def ageDistribution():
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    try:
        ageDis = execute(c,"select auth_userprofile.user_id,auth_user.username,(year(from_unixtime(unix_timestamp())) - auth_userprofile.year_of_birth) as age from auth_userprofile join auth_user on auth_user.id=auth_userprofile.user_id")
        for i in range(4):
            agesPC.loc[agesPC.shape[0]] = [str(i*20) + "-" + str((i + 1)*20),len(ageDis[(ageDis.age > i*20) & (ageDis.age <= ((i + 1)*20))]["age"].tolist())]
        ageDis.to_csv("/home/hduser/django/testex/testex/static/ageDis.tsv",sep="\t")
        agesPC.to_csv("/home/hduser/django/testex/testex/static/agesPC.csv")
    except ValueError:
        return 1        
    c.close()
    return 0

def degreeDistributionByCourse(course):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    total = int(execute(c, "select count(*) as c from auth_userprofile")["c"])
    usersSubQ = '(select distinct user_id from log_table where course_id="' + course + '" and username is not null and username!="")users'
    degreeDis = execute(c,
                        'select auth_userprofile.level_of_education,count(auth_userprofile.id) as edcount from ' + usersSubQ + ' join auth_userprofile on auth_userprofile.user_id=users.user_id where auth_userprofile.level_of_education is not null and auth_userprofile.level_of_education not in ("","null","none") group by auth_userprofile.level_of_education')
    degreeDis.loc[degreeDis.shape[0]] = ["None", total - sum(degreeDis["edcount"].tolist())]
    degreeDis.to_csv("/home/hduser/django/testex/testex/static/degreeDist.tsv", sep="\t")

def seqGraphByCourse(course,timeStart,timeEnd):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    print course + "sdvsd" + timeStart + "sdfds" + timeEnd
    seqQuery = 'select user_id,category from (select user_id,case when event_type in("problem_check","problem_show","problem_check_fail","problem_reset","problem_rescore","problem_rescore_fail","problem_save","problem_show","reset_problem","reset_problem_fail","show_answer","save_problem_fail","save_problem_success","problem_graded","problem_check","problem_get","problem_save","problem_show") then "problem" when event_type in ("edx.course.enrollment.activated","edx.course.enrollment.deactivated","edx.course.enrollment.upgrade.clicked","edx.course.enrollment.upgrade.succeeded") then "enrollment" when event_type in ("play_video","pause_video","seek_video","speed_change_video","load_video","hide_transcript","show_transcript") then "video" when event_type in ("seq_goto","seq_next","seq_prev","page_close") then "navigation" when event_type in ("edx.forum.searched") then "forum" when event_type in ("book","textbook.pdf.thumbnails.toggled","textbook.pdf.thumbnail.navigated","textbook.pdf.outline.toggled","textbook.pdf.chapter.navigated","textbook.pdf.page.navigated","textbook.pdf.page.navigated","textbook.pdf.zoom.buttons.changed","textbook.pdf.zoom.menu.changed","textbook.pdf.display.scaled","textbook.pdf.display.scrolled","textbook.pdf.search.executed","textbook.pdf.search.navigatednext","textbook.pdf.search.highlight.toggled","textbook.pdf.search.casesensitivity.toggled") then "textbook" end as category,time from log_table where user_id!="" and course_id="' + course + '" and time > "' + timeStart + '" and time < "' + timeEnd + '" order by user_id,time)seq_table where category is not null'
    mySeq = execute(c,seqQuery)
    seq = DataFrame(columns=["source", "target","value"])
    for i in range(1,mySeq.shape[0]):
        if(mySeq.ix[i]["user_id"] == mySeq.ix[i - 1]["user_id"]):
            seq.loc[seq.shape[0]] = [mySeq.ix[i - 1]["category"],mySeq.ix[i]["category"],1]
        else:
            pass
    c.close()
    seq.to_csv("/home/hduser/django/testex/testex/static/courseSequence.csv")
    return seq

def activityGraphByCourse(course,timeStart,timeEnd,wise = "day"):
    c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
    if(wise=="hour"):
        hourWiseActivity = execute(c,'select time,hour(time),count(distinct user_id) as students from log_table where user_id is not null and time > "' + timeStart + '" and time < "' + timeEnd + '" group by hour(time),time')
    if(wise=="day"):
        dayWiseActivity = execute(c,'select concat(year(time),month(time),day(time)) as day,count(distinct user_id) as students from log_table where user_id is not null and time > "' + timeStart + '" and time < "' + timeEnd + '" group by concat(year(time),month(time),day(time))')
    dayWiseActivity.to_csv("/home/hduser/django/testex/testex/static/activity.csv",columns=["day","students"])
    c.close()
if __name__ == '__main__':
    main()

