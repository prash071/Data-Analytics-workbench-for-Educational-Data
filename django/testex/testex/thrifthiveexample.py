import pyhs2

conn = pyhs2.connect(host='localhost', 
					port=10000,
					authMechanism="PLAIN", 
					user='hduser', 
					password='hduser123', 
					database='default')
def getHiveConn(my_host, my_port, my_authMechanism, my_user, my_pass,my_database):
    # Currently using no pass
    conn = connect(host=my_host, port=my_port, authMechanism=my_authMechanism, user=my_user,database=my_database)
    cursor = conn.cursor()
    return cursor

def execute(cur, query):
    cur.execute(query)
    columnNames = [a['columnName'] for a in cur.getSchema()]
    return DataFrame(cur.fetch(),columns=columnNames)

c = getHiveConn("localhost", 10000, "PLAIN", "hduser", "", "localdb")
courses_year = execute(c,"select course_id,min(time) from log_table where course_id is not null and course_id!='' and year(time)='2014' group by course_id")
c.close()
print course_year

cur.close()
conn.close()
