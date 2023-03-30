pipeline {
    agent any

    stages {
        stage('pull code from github') {
            steps {
                git branch: 'main', url: 'git@github.com:javaxxl/hello-world.git'
                echo 'pull code from github - SUCCESS'
            }
        }
        stage('build docker image') {
            steps {

                sh 'java --version'
                sh '/usr/share/maven/mvn -v'
                sh '/usr/share/maven clean package -DskipTests -X'
                echo 'mvn - SUCCESS'
            }
        }
        stage('sonarqube scan code') {
            steps {
                echo 'sonarqube scan code - SUCCESS'
            }
        }
        stage('push code to server ') {
            steps {
                echo 'push code to server - SUCCESS'
            }
        }
        stage('send message to channel ') {
            steps {
                echo 'send message to channel - SUCCESS'
            }
        }
    }
}
