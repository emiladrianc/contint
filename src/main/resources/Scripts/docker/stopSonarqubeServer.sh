echo -e "\e[34;107mStopping sonarqube server container ... \e[0m"

docker stop sonarqube

echo -e "\e[34;107mStopping sonarqube server container ... Done\e[0m"

echo -e "\e[34;107mRemoving sonarqube server container ... \e[0m"

docker rm sonarqube

echo -e "\e[34;107mRemoving sonarqube server container ... Done\e[0m"