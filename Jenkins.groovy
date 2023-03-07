def base_path = "gcp-op-as-infra-saas"

pipeline {
  agent any

  environment{
        
    }

    stages{
        stage(test){
            steps{
                script(){
                    checkout scm
                    branch = env.BRANCH_NAME
                    sh 'echo ${branch}'
                }
            }
        }
    }
}