import os
import shutil

## Global Variables
dest=os.path.expanduser("/home/hduser/separate-data/sql-data/")
dest = os.path.expanduser(dest)
dest_json=os.path.expanduser("/home/hduser/separate-data/json-data/")
dest_auth_user=dest+"sql-auth-user/"
dest_auth_userprofile=dest+"sql-auth-userprofile/"
dest_courseware_studentmodule=dest+"sql-courseware-studentmodule/"
dest_wiki_article=dest+"sql-wiki-article/"
dest_wiki_articlerevision=dest+"sql-wiki-articlerevision/"
dest_student_courseenrollment=dest+"sql-student-courseenrollment/"
dest_certificates_generatedcertificate=dest+"sql-certificates-generatedcertificate/"
dest_user_api_usercoursetag=dest+"sql-user-api-usercoursetag/"
dest_user_id_map=dest+"sql-user-id-map/"
destarr=[dest,dest_json,dest_auth_user,dest_auth_userprofile,dest_courseware_studentmodule,dest_wiki_article,dest_wiki_articlerevision,
dest_student_courseenrollment,dest_certificates_generatedcertificate,dest_user_api_usercoursetag,dest_user_id_map]
##

def run_bash(comm):
    params=comm.split(' ')
    subprocess.call(params)

def uploader(src):
	for dirname, dirnames, filenames in os.walk(src):
	    for filename in filenames:
		    filepath=os.path.join(dirname, filename)
		    if filename.endswith(".json"):
			shutil.copy(filepath,dest_json)
		    elif filename.endswith(".sql"):
			tablename=filename.split('-')[3]
			if(tablename=="auth_user"):
			    shutil.copy(filepath,dest_auth_user)
			elif(tablename=="auth_userprofile"):
			    shutil.copy(filepath,dest_auth_userprofile)
			elif(tablename=="courseware_studentmodule"):
			    shutil.copy(filepath,dest_courseware_studentmodule)
			elif(tablename=="wiki_article"):
			    shutil.copy(filepath,dest_wiki_article)
			elif(tablename=="wiki_articlerevision"):
			    shutil.copy(filepath,dest_wiki_articlerevision)        
			elif(tablename=="student_courseenrollment"):
			    shutil.copy(filepath,dest_student_courseenrollment)        
			elif(tablename=="certificates_generatedcertificate"):
			    shutil.copy(filepath,dest_certificates_generatedcertificate)
			elif(tablename=="user_api_usercoursetag"):
			    shutil.copy(filepath,dest_user_api_usercoursetag)
			elif(tablename=="user_id_map"):
			    shutil.copy(filepath,dest_user_id_map)
			elif(tablename=="student_courseenrollment"):
			    shutil.copy(filepath,dest_student_courseenrollment)

def dir_create(dirarr):
	for destination in dirarr:
		create_dir(destination)


def create_dir(direc):
	direc= os.path.expanduser(direc)
	if not os.path.exists(direc):
		os.makedirs(direc)


def main():
	print "Enter the location of the files: "
	src = os.path.expanduser(raw_input())
	#Create required directories
	dir_create(destarr)
	uploader(src)
	#Remove the files finally
	shutil.rmtree(os.path.expanduser('/home/hduser/separate-data'))
	

if __name__=='__main__':
	main()

