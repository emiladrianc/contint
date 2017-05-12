echo -e "\e[34;107mGetting docker maildog image ... \e[0m"

docker pull mailhog/mailhog

echo -e "\e[34;107mGetting docker maildog image ... Done\e[0m"

echo -e "\e[34;107mGetting docker maildog container ... \e[0m"

docker run --restart unless-stopped --name mailhogServer -p 1025:1025 -p 8025:8025 -d mailhog/mailhog

echo -e "\e[34;107mGetting docker maildog container ... Done\e[0m"