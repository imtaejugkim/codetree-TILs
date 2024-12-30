fun main(){
    val matrix = readLine()!!.trim().split(" ").map{it.toInt()}
    val (a,b) = matrix
    val new = Array(a){IntArray(b){0}}

    val arr1 = Array(a){readLine()!!.trim().split(" ").map{it.toInt()}}
    val arr2 = Array(a){readLine()!!.trim().split(" ").map{it.toInt()}}

    for(i in 0 until a){
        for(j in 0 until b){
            if(arr1[i][j] != arr2[i][j]){
                new[i][j] = 1
            } else {
                new[i][j] = 0
            }
            print(new[i][j])
            print(" ")
        }
        println()
    }
}