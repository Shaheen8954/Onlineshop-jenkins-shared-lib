#!/usr/bin/env groovy

 /**
   * push the docker image to the docker hub
    */

 def call() {
     sh 'docker tag onelineshop:latest iemafzal/onelineshop:latest'
     sh 'echo ${dockerpassword} | docker login -u ${dockerUser} --password-stdin'
     sh 'docker push iemafzal/onelineshop:latest'
}