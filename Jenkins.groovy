def base_path = "gcp-op-as-infra-saas"

pipeline {
  agent any

  environment{
        branch = "$params.Env"
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