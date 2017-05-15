echo -e "\e[34;107mGetting docker nexus image ... \e[0m"

docker pull sonatype/nexus

echo -e "\e[34;107mGetting docker nexus image ... Done\e[0m"

echo -e "\e[34;107mGetting docker nexus server ... \e[0m"

docker run -d -p 8081:8081 --name nexus sonatype/nexus

echo -e "\e[34;107mGetting docker nexus server ... Done\e[0m"