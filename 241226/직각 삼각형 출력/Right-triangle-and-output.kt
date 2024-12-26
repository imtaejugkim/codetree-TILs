fun main(){
    val a = readLine()!!.toInt()

    for(i in 1..a){
        for(j in 1..(2*i-1)){
            print("*")
        }
        println()
    }
}