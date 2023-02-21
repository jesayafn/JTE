void call(app_env){
    String gitUrl = app_env.git_uarl
    String branch = app_env.branch ?: "main"
	String nodeName = config.nodename ?: "master"
    stage("Git Checkout"){
        node(nodeName){
		//cleanWs()
		// git branch: "${branch}", url: "${url}"
        // checkout(
        //     $class: 'GitSCM',
        //     branches: [[name: "${branch}"]],
        //     doGenerateSubmoduleConfigurations: false,
        //     extensions: [],
        //     submoduleCfg: [],
        //     userRemoteConfigs: [[url: "${url}"]]
        // )
        // println(url)
        checkout scmGit(
            branches: [[name: "*/${branch}"]], 
            extensions: [], 
            userRemoteConfigs: [[url: "${gitUrl}"]])
	    }
    }
}