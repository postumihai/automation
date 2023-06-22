pipeline {
    agent any
    tools {
            maven 'Maven 3.9.2'
        }
    stages {
//         stage('Clone code') {
//             git 'https://github.com/postumihai/automation.git'
//         }
        stage('Build test code') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Execute test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Generate HTML report') {
            steps {
                script {
                    publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: '', useWrapperFileDirectly: true])
                }
            }
        }
    }
}