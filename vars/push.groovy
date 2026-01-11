def call(String dockerHubUser , String imageName , String tag) {
    withCredentials([usernamePassword(credentialsId: 'agentDockerHubCred', usernameVariable: 'agentDockerHubUser', passwordVariable: 'agentDockerHubPass')]) {
                    sh "docker login -u ${agentDockerHubUser} -p ${agentDockerHubPass}"
                    sh "docker push ${dockerHubUser}/${imageName}:${tag}"
                }
}
