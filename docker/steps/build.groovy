void call(app_env){
    String nodeName = config.nodename ?: "master"
    String userName = app_env.user
    String password = app_env.password
    String registryUrl = app_env.docker_url
    node(nodeName){
    stage("Build Image"){
        sh """docker login ${registryUrl} --username ${userName} --password ${password}"""
        sh """docker build"""
        }
    }

}