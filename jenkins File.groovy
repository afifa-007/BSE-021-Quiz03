pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from the Jenkins workspace
                echo 'Checking out the source code...'
                // If using a Git repo, you could use: git 'https://your-repo-url.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java program...'
                sh 'javac HelloWorld.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running Java program...'
                sh 'java HelloWorld < input.txt'
                // You can create input.txt with a sample name to simulate user input
            }
        }
    }

    post {
        success {
            echo 'Job completed successfully.'
        }
        failure {
            echo 'Job failed.'
        }
    }
}
