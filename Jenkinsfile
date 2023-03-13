pipeline {
    agent any
    stages {
        stage('Build') {
            agent { 
                 dockerfile { 
                      dir "./back"
                      args "-p 5050:5050" 
                 }
            }     
            steps {
                echo "hey there"
            }  
        }
    }
}