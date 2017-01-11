#!/usr/bin/env bash
this="${BASH_SOURCE-$0}"
if readlink -f "$this" > /dev/null 2>&1
then
  this=`readlink -f "$this"`
fi
basedir=`dirname "$this"`
basedir=`cd "$basedir">/dev/null; pwd`
. $basedir/env
exec $JAVA \
     $JVM_OPTS \
     -jar $basedir/target/extend-server*.jar \
     com.huitui.Application <&- &
[ ! -z $PIDFILE ] && printf "%d" $! > $PIDFILE

exit $?
