from pyhs2 import *
import sasl

conn = connect(host="localhost",port=10000,authMechanism="PLAIN",user="hduser")

cur = conn.cursor()
creater = '''
'''

#cur.execute(creater)
try:
	cur.execute("select * from edm_log_table limit 10")
	a = cur.fetch()
	print a
except Exception as e:
	print "Exception is " + str(e)

#print cur.fetch()
