


pipeline{
  agent any
  environment{
    docker_credentials=credentials('dockerhub')
  }
  stages{
    
    stage('Test'){
      steps{
        echo 'test'
      }
    }
    stage('Build'){
      steps{
        sh 'mvn install -DskipTests'
//         sh 'sudo docker build -t onesmus1024/wambugu-grocery-product-service .'
      }
    }
    stage('push'){
      steps{
        sh 'sudo docker push onesmus1024/wambugu-grocery-product-service  '
      }
    }
    stage('Deploy'){
      steps{
        echo "sudo docker push onesmus1024/wambugu-grocery-product-service  "
      }
    }
  }
  
  
}
