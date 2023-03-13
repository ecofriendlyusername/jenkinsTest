pipeline {
    agent {
          dockerfile { dir "./back" }
    }
    stages {
        stage('run') {
            agent any
            steps {
                echo 'testing... hello'
                sh 'pwd'
            }
        }
    }
}
