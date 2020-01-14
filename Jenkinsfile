pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean install'
      }
    }
     stage('Build') {
          steps {
            sh 'docker build --tag bankmanager:latest . '
          }
        }
     stage('Deploy') {
          steps {
            sh '''docker stop bankmanager || true && docker rm bankmanager || true;
            docker run -d -p 7575:8080 bankmanager:latest
            '''
          }
     }
  }
}