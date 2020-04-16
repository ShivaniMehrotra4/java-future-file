pipeline {
    agent any

    stages {
        stage('Parallel steps') {
            parallel {
                stage('Build on slave 1') {
                    agent { 
                    	label 'ubuntu'
                    }
                    steps {
                    	mvn clean
                    }
                }
                stage('Build on slave 2') {
                    agent { 
                        label 'ubuntu'
                    }
                    steps {
                        mvn clean
                    }
                }
            }
        }
    }
}
