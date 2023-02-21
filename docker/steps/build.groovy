void call(app_env){
    String nodeName = config.nodename ?: "master"
    String userName = app_env.user
    String password = app_env.password
    String imageTag = app_env.imageTag
    // if(!userName?.trim() || !password.trim() || !imageTag.trim()){
    //     println("ABORT! NEED SOME PARAMETER")  
    // } else{
    node(nodeName){
    stage("Build Image"){
        sh '''buiildah login --username ${app_env.user} --password ${app_env.password --verbose'''
        }
    }
    // }
}