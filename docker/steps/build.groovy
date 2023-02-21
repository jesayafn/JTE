void call(app_env){
    String nodeName = config.nodename ?: "master"
    String userName = app_env.user
    String password = app_env.password
    String registryUrl = app_env.docker_url
    stage("Build Image"){
        node(nodeName){
        sh """docker login ${registryUrl} --username ${userName} --password ${password}"""
        sh """docker build"""
        }
    }

}