pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t wee ./back'
            }
        }
    }

     post { 
        always { 
            sh 'docker run -p 5050:5050 wee'
        }
    }
}