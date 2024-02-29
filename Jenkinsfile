pipeline {
    agent any
    tools {
        maven 'Maven-3.9.6'
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('Dockerhub-Credentials')
    }
    stages {
        stage('Checkout from Git') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ikoyski/webtools-bin-lookup.git']])
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t ikoyski/webtools-bin-lookup:latest .'
                }
            }
        }
        stage('Login to Docker Hub') {
            steps {
                script {
                    sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
                }
            }
        }
        stage('Push Image to Docker Hub') {
            steps {
                script {
                    sh 'docker push ikoyski/webtools-bin-lookup:latest'
                }
            }
        }
    }
}