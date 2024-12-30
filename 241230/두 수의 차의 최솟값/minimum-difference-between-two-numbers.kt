import kotlin.math.abs

fun main(){
    val a = readLine()!!.toInt()
    val input = readLine()!!.trim().split(" ").map{it.toInt()}
    var result = 0
    var min = Int.MAX_VALUE

    for(i in 0 until a){
        for (j in i+1 until a){
            result = abs(input[j]- input[i])
            if(min > result){
                min = result
            }              
        }
    }
    println(min)
}