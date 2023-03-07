def base_path = "gcp-op-as-infra-saas"

pipeline {
  agent any

  environment{
        branch = env.BRANCH_NAME
    }

    stages{
        stage(test){
            steps{
                script(){
                    sh 'echo ${branch}'
                }
            }
        }
    }
}