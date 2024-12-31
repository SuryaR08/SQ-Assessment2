pipeline {
    agent any

    tools {
        maven 'sonarmaven' 
    }

    environment {
        MAVEN_PATH = 'C:\\Users\\surya\\Downloads\\apache-maven-3.9.9-bin\\apache-maven-3.9.9\\bin'
        SONAR_TOKEN = credentials('sonarqube-token')
        SONAR_HOST_URL = 'http://localhost:9000'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                bat '''
                set PATH=%MAVEN_PATH%;%PATH%
                mvn sonar:sonar ^
                  -Dsonar.projectKey=SQ-Assessment2 ^
                  -Dsonar.sources=src/test/java/com/example/automation ^
                  -Dsonar.host.url=http://localhost:9000 ^
                  -Dsonar.token=%SONAR_TOKEN%
                '''
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo 'Pipeline failed. Check logs for details.'
        }
    }
}
