pipeline {
    agent any
   tools {
         maven 'Maven3.9.2'
       }
    stages {
        stage('Env prepare') {
             steps {
             sh 'source ~/.zprofile'
//                sh 'export M2_HOME=/opt/homebrew/Cellar/maven/3.9.2'
//                sh 'export PATH=$PATH:$M2_HOME/bin'
               sh 'mvn --version'
                   }
        }
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