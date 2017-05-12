echo -e "\e[34;107mGetting docker sonarqube image ... \e[0m"

docker pull sonarqube

echo -e "\e[34;107mGetting docker sonarqube image ... Done\e[0m"

echo -e "\e[34;107mGetting docker sonarqube server ... \e[0m"

docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube

echo -e "\e[34;107mGetting docker sonarqube server ... Done\e[0m"