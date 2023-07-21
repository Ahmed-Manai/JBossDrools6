# JBossDrools6



mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=org.drools.Myapp -DartifactId=myapp


lsb_release -a ##check ubuntu release 

## downgrade to java 8

sudo apt-get update
sudo apt install software-properties-common
sudo apt update
sudo apt install openjdk-8-jdk

update-java-alternatives --list
sudo update-java-alternatives --set java-1.8.0-openjdk-amd64

export JAVA_HOME=/path/to/openjdk-8-directory
export PATH=$JAVA_HOME/bin:$PATH

echo $JAVA_HOME
echo $PATH

java -version

mvn clean install 
mvn exec:java -Dexec.mainClass="org.drools6.book.App"

mvn clean package exec:java -Dexec.mainClass="org.drools6.ddengine.App"