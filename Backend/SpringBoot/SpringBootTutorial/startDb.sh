#!/bin/bash

docker stop pg-docker
docker rm pg-docker
docker-compose up --build --remove-orphans -d
