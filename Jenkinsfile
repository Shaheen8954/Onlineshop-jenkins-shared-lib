pipeline {
    agent any

    stages {
        stage('Clone repo') {
            steps {
                git url: "https://github.com/Shaheen8954/nodejs.git", branch: "main"
            }
        }
        stage('Build image') {
            steps {
                sh "docker build -t nodejs-app ."
            }
        }
        stage('Run container') {
            steps {
               sh "docker run -d -p 5001:5001 nodejs-app"
            }
        }
    }
}