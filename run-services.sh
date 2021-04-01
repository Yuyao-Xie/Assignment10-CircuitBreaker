#!/bin/bash

cd service2
./gradlew run &
cd ..
cd service1
./gradlew run &
cd ..
cd gateway
./gradlew bootRun &
cd ..

