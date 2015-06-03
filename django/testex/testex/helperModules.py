from pyhs2 import *
import sasl
import MySQLdb
from pandas import *


#General
def unique(arr):
    return list(set(arr))

def boolVect(arr):
    bools = []
    for entry in arr:
        if entry.lower() == "true":
            bools.append(True)
        else:
            bools.append(False)
    return bools

def tointVect(arr):
    ints = []
    for entry in arr:
        ints.append(int(entry))
    return ints

#HIVE-Related

def getHiveConn(my_host, my_port, my_authMechanism, my_user, my_pass,my_database):
    # Currently using no pass
    conn = connect(host=my_host, port=my_port, authMechanism=my_authMechanism, user=my_user,database=my_database)
    cursor = conn.cursor()
    return cursor

def execute(cur, query):
    cur.execute(query)
    columnNames = [a['columnName'] for a in cur.getSchema()]
    return DataFrame(cur.fetch(),columns=columnNames)