#!/usr/bin/env groovy
//** deploying the image

def call () {
    echo " Deploying the image"
    sh 'docker run -d -p 3000:80 iemafzal/onelineshop:latest'
}