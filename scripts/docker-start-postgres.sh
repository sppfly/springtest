#/usr/bin/bash
docker container run -e POSTGRES_PASSWORD=123456 -e POSTGRES_USER=liuyi -p 5432:5432 -v postgres postgres:alpine
