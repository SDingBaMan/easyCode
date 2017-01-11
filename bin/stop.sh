#!/bin/sh

this="${BASH_SOURCE-$0}"
if readlink -f "$this" > /dev/null 2>&1
then
  this=`readlink -f "$this"`
fi
basedir=`dirname "$this"`
basedir=`cd "$basedir">/dev/null; pwd`

. $basedir/env

[ -f $PIDFILE ] && pid=$(cat $PIDFILE)
[ -n "$pid" ] && ps -p $pid|grep $pid >/dev/null
if [ $? -eq 0 ]; then
  echo "kill process by pid match."
  kill -9 $pid
  exit
fi
echo "can not find process."
