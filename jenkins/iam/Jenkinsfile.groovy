node {
    stage("Clone Repo"){
        git 'https://github.com/farrukh90/iam.git'
    }
    stage("Get list of User"){
        dh = new File("${pwd()}/userlist")
            dh.eachFile {
            println(it)
        }
    }
}