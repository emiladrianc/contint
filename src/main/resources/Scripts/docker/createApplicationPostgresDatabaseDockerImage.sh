echo -e "\e[34;107mCreateing postgress image ... \e[0m"

docker build . -f ApplicationPostgresdatabaseDockerfile -t applicationpostgressdatabase

echo -e "\e[34;107mCreateing postgress image ... Done\e[0m"

echo -e "\e[34;107mRunning postgress server for application ... \e[0m"

docker run -d --name applicationPostgresServer -p 5432:5432 applicationpostgressdatabase

echo -e "\e[34;107mRunning postgress server for application ... Done\e[0m"