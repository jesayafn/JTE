void call(){
    stage("Messaging to the my world!")
    String nodeName = config.messsages ?: "jesaya"
    node(nodeName){
        println nodeName+" on WORK!"
    }
}