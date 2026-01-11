def call(String url , String branch) {
    echo "Cloning repository from github"
    git url: "${url}" , branch: "${branch}"
}
