#!/bin/bash
cd /home/www/extend_server
echo 'STEP1: update..................................................'
git pull
echo 'STEP2: compile.................................................'
mvn clean package -DskipTests=true -Pprod
echo 'STEP3: stop old................................................'
/home/www/extend_server/bin/stop.sh
echo 'STEP4: start new...............................................'
/home/www/extend_server/bin/startup.sh
