#!/bin/usr/env groovy

 def call(){
    echo 'Building the docker image'
    sh "docker build -t onelineshop:latest ."
 }