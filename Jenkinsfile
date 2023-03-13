pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t extag ./back'
                sh 'docker run -p 5050:5050 extag'
            }
        }
    }
}