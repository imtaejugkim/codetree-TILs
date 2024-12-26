fun main(){
    val a = readLine()!!.toInt()

    for(i in 0..1){
        for(i in 0..a-1){
            for (j in 0..a-1){
                print("*")
            }
            println()
        }
        println()
    }
}