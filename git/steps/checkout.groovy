void call(app_env){
    String url = app_env.git_url
    String branch = app_env.branch ?: "main"
	String nodeName = config.nodename ?: "master"
	node(nodeName){
        stage("Git Checkout"){
		//cleanWs()
		// git branch: "${branch}", url: "${url}"
        checkout(
            [
            $class: 'GitSCM',
            branches: [[name: "${branch}"]],
            doGenerateSubmoduleConfigurations: false,
            extensions: [],
            submoduleCfg: [],
            userRemoteConfigs: [[url: "${url}"]]
            ]
        )
	}
}