pipeline {
  agent any
  stages {
    stage('Tools Version') {
      parallel {
        stage('Tools Version') {
          steps {
            sh '''java -version
'''
          }
        }
        stage('Check for POM file in repository') {
          steps {
            fileExists 'pom.xml'
          }
        }

      }
    }

    stage('Build Solution') {
      steps {
        echo 'maven compile test package'
      }
    }

    stage('Send Message to Teams') {
      steps {
        echo 'Need to send to Teams'
      }
    }

  }
  environment {
    Dev = 'DEV'
  }
}