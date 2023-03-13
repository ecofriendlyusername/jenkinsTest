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
            }
        }
    }
}
