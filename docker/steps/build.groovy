void call(app_env){
    String nodeName = config.nodename ?: "master"
    String userName = app_env.user
    String password = app_env.password
    // String credentials = app_env.credentials
    String registryUrl = app_env.url
    // String imageTag = app_env.imageTag
    // if(!userName?.trim() || !password.trim() || !imageTag.trim()){
    //     println("ABORT! NEED SOME PARAMETER")  
    // } else{
    node(nodeName){
    stage("Build Image"){
        sh """docker login ${registryUrl} --username ${userName} --password ${password} --insecure"""
        // sh "echo $userName"
        // println("user is:$credentials")
        }
    }
    // }
}