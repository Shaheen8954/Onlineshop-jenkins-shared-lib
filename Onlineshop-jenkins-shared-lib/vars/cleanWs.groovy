#!/usr/bin/env groovy

/**
 * Clean up the workspace before starting the build
 */

def call(){
    echo 'cleane the workspace'
    cleanws()

  }
