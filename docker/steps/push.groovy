void call(app_env){
    // String dirContext = app_env.dir_context
    String nodeName = config.nodename ?: "master"
    String userName = app_env.docker_user
    String password = app_env.docker_password
    String registry = app_env.docker_registry
    String tag = app_env.docker_image_tag
    stage("Build Image"){
        node(nodeName){
        sh """docker login http://${registry} --username ${userName} --password ${password}"""
        sh """docker push ${registry}/${userName}/${tag}"""
        // sh """cd ${dirContext} && docker build ."""
        }
    }

}