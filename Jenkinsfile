pipeline {
    agent none
    stages {
        stage('run') {
            agent any
            steps {
                echo 'testing... hello'
                sh 'pwd'
                sh 'docker build . -t dname'
                sh 'docker run dname -p 5050'
            }
        }
    }
}
