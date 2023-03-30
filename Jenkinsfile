pipeline {
    agent any
    tools {
            jdk 'jdk-17'
    }

    stages {
        stage('pull code from github') {
            steps {
                git branch: 'main', url: 'git@github.com:javaxxl/hello-world.git'
                echo 'pull code from github - SUCCESS'
            }
        }
        stage('maven build') {
            steps {

                sh 'java --version'
                sh 'mvn -v'
                sh 'mvn clean package -DskipTests -X'
                echo 'mvn - SUCCESS'
            }
        }
        stage('sonarqube scan code') {
            steps {
                echo 'sonarqube scan code - SUCCESS'
            }
        }
        stage('run the jar') {
            steps {
                sh 'java -jar /var/jenkins_home/jobs/hello-world/workspace/target/hello-world-0.0.1-SNAPSHOT.jar'
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
