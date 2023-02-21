void call(app_env){
    String dirContext = app_env.dir_context
    String nodeName = config.nodename ?: "master"
    String userName = app_env.user
    String tag = app_env.docker_image_tag
    // String password = app_env.password
    String registryUrl = app_env.docker_url
    stage("Build Image"){
        node(nodeName){
        // sh """docker login ${registryUrl} --username ${userName} --password ${password}"""
        sh """cd ${dirContext} && docker build . -t ${registryUrl}/${userName}/${tag}"""
        }
    }

}