def call(String imageName , String imageTag) {
    echo "Building the docker image"
    sh "docker build -t ${imageName}:${imageTag} ."
}
