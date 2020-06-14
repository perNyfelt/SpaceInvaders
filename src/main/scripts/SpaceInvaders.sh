#!/usr/bin/env bash

javacmd=$(which java)

if [ -f "$javacmd" ]; then
  javaVersion=$(java -version 2>&1 >/dev/null | grep 'version' | awk '{print $3}')
  if [[ $javaVersion != \"1.8* ]]; then
    echo "Java version must be 1.8 but was $javaVersion"
    exit 1
  fi
else
  echo "java could not be found on path"
  exit 1
fi

echo "starting SpaceInvaders, logging to SpaceInvadersConsole.log"
java -jar SpaceInvaders-1.0.jar > SpaceInvadersConsole.log &