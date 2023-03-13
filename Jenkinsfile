pipeline {
    agent { 
        dockerfile {
            dir "./back"
        } 
    }
    stages {
        stage('Test') {
            steps {
                echo 'testing... hello'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploying... hello'
            }
        }
    }
}
