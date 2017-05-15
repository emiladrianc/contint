echo -e "\e[34;107mStopping nexus server container ... \e[0m"

docker stop nexus

echo -e "\e[34;107mStopping nexus server container ... Done\e[0m"

echo -e "\e[34;107mRemoving nexus server container ... \e[0m"

docker rm nexus

echo -e "\e[34;107mRemoving nexus server container ... Done\e[0m"