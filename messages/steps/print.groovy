void call(){
    stage("Messaging to the my world!")
    String nodeName = config.nodename ?: "jesaya"
    node(nodeName){
        println nodeName+" on WORK!"
    }
}