pipeline {
    agent none

    stages {
        stage('Parallel steps') {
            parallel {
                stage('Build on slave 1') {
                    agent { 
                        label 'ubuntu'
                    }
                    steps {
                        mvn clean compile
                    }
                }
                stage('Build on slave 2') {
                    agent { 
                        label 'ubuntu'
                    }
                    steps {
                        mvn clean compile
                    }
                }
            }
        }
    }
}
