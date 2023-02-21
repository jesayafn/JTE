void call(app_env){
    String dirContext = app_env.dir_context
    String nodeName = config.nodename ?: "master"
    String userName = app_env.docker_user
    String tag = app_env.docker_image_tag
    // String password = app_env.password
    String registry = app_env.docker_registry
    stage("Build Image"){
        node(nodeName){
        // sh """docker login ${registryUrl} --username ${userName} --password ${password}"""
        sh """cd ${dirContext} && docker build . -t ${registry}/${userName}/${tag}"""
        }
    }

}