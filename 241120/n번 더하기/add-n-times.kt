fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}

    for(i in 1..input[1]){
        println(input[0]+input[1]*i)
    }
}