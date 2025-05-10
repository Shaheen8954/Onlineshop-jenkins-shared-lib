#!/usr/bin/env groovy

// *  Checkout the repository

 def call() {
     echo "Checking out the repository"
     checkout scm
 }
