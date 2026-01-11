def call(String dockerHubUser , String imageName , String imageTag) {
    echo "Building the docker image"
    sh "docker build -t ${dockerHubUser}/${imageName}:${imageTag} ."
}
