pipeline {
    agent none
    stages {
        stage('run') {
            agent { 
               dockerfile { 
                    dir "./back" 
               } 
            }
            steps {
                echo 'testing... hello'
                sh 'docker build -t somename'
                sh 'docker run somename -p 5050'  
            }
        }
    }g
}
