#!/bin/bash

#echo  "enter password"
#read -s pass
#echo $pass

echo "Version : 2.2.0"
echo "PreWarnings"
echo "32 bit is preferrable as Native Hadoop Implementation requires 32 bit"
echo "This has been tested on Ubuntu 12.04 and Ubuntu 14.04"

##### Prerequisites ####

sudo apt-get install openssh-server

sudo apt-get install openjdk-7-jdk

#### Create symbolic link ####
ln -s /usr/lib/jvm/java-7-openjdk-amd64 jdk

#### Add group and users for hadoop ecosystem ####
cd

sudo addgroup hadoop

sudo adduser --ingroup hadoop hduser

#### Register user as a sudoer ####
sudo adduser hduser sudo

#### Setup SSH cert with no passpharse and give authorization ####
ssh-keygen -t rsa -P '' -f ~/.ssh/id_dsa

cat $HOME/.ssh/id_dsa.pub >> $HOME/.ssh/authorized keys
ssh localhost
exit
#### Disable ipv6 ####

x = $(cat /proc/sys/net/ipv6/conf/all/disable_ipv6)

if[ "$x" -eq 0 ]
then
	echo "#disable ipv6" >> /etc/sysctl.conf
	echo "net.ipv6.conf.all.disable_ipv6 = 1" >> /etc/sysctl.conf
	echo "net.ipv6.conf.default.disable_ipv6 = 1" >>  /etc/sysctl.conf
	echo "net.ipv6.conf.lo.disable_ipv6 = 1" >> /etc/sysctl.conf
	sudo sysctl -p 
fi

su - hduser

#### Get the setup for hadoop ####
wget http://apache.mirrors.lucidnetworks.net/hadoop/common/stable/hadoop-2.2.0.tar.gz

sudo tar vxzf hadoop-2.2.0.tar.gz -C /usr/local

cd /usr/local

sudo mv hadoop-2.2.0 hadoop

sudo chown -R hduser:hadoop hadoop

#### Setup Hadoop Variables ####
cd 

sudo echo "" >> .bashrc

sudo echo "#Hadoop variables" >> .bashrc

sudo echo "export JAVA_HOME=/usr/lib/jvm/jdk/" >> .bashrc

sudo echo "export HADOOP_INSTALL=/usr/local/hadoop" >> .bashrc

sudo echo "export PATH=$PATH:$HADOOP_INSTALL/bin" >> .bashrc

sudo echo "export PATH=$PATH:$HADOOP_INSTALL/sbin" >> .bashrc

sudo echo "export HADOOP_MAPRED_HOME=$HADOOP_INSTALL" >> .bashrc

sudo echo "export HADOOP_COMMON_HOME=$HADOOP_INSTALL" >> .bashrc

sudo echo "export HADOOP_HDFS_HOME=$HADOOP_INSTALL" >> .bashrc

sudo echo "export YARN_HOME=$HADOOP_INSTALL" >> .bashrc

sudo echo "export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_INSTALL/lib/native" >> .bashrc

sudo echo 'export HADOOP_OPTS="-Djava.library.path=$HADOOP_INSTALL/lib"' >> .bashrc

sudo echo "" >> .bashrc

#### Modify JAVA_HOME in /usr/local/hadoop/etc/hadoop/hadoop-env.sh ####
export JAVA_HOME = /usr/lib/jvm/jdk

sed -i '/JAVA_HOME={JAVA_HOME}/c\ export JAVA_HOME=/usr/lib/jvm/jdk' /usr/local/hadoop/etc/hadoop/hadoop-env.sh

#### Configuring Hadoop ####
cd /usr/local/hadoop/etc/hadoop
 
mv mapred-site.xml.template mapred-site.xml

sed -i '/<configuration>/ a\ <property>\n<name>fs.defaultFS</name>\n<value>hdfs://localhost:9000</value>\n</property>' core-site.xml

sed -i '/<configuration>/ a\ <property>\n<name>yarn.nodemanager.aux-services</name>\n<value>mapreduce_shuffle</value>\n</property>\n<property>\n   <name>yarn.nodemanager.aux-services.mapreduce.shuffle.class</name>\n<value>org.apache.hadoop.mapred.ShuffleHandler</value>\n</property>' yarn-site.xml

sed -i '/<configuration>/ a\ <property>\n<name>mapreduce.framework.name</name>\n<value>yarn</value>\n</property>' mapred-site.xml

sed -i '/<configuration>/ a\ <property>\n<name>dfs.replication</name>\n<value>1</value>\n</property>\n<property>\n<name>dfs.namenode.name.dir</name>\n
<value>file:/home/hduser/mydata/hdfs/namenode</value>\n</property>\n<property>\n<name>dfs.datanode.data.dir</name>\n<value>file:/home/hduser/mydata/hdfs/datanode</value>\n</property>' hdfs-site.xml

#### Creating namenode and datanode ####
cd 

mkdir -p mydata/hdfs/namenode

mkdir -p mydata/hdfs/datanode

#### Formatting namenode and datanode ####
hdfs namenode -format

#### Starting hadoop
start-dfs.sh
start-yarn.sh

jps
