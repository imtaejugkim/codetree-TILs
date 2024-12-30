fun main(){
    val arr = Array(4){readLine()!!.trim().split(" ").map{it.toInt()}}
    var result = 0

    for(i in 0 until 4){
        for(j in 0..i){
            result += arr[i][j]
        }
    }
    println(result)
}