fun main(){
    var nums = readLine()!!.split(" ").map{it.toInt()}
    val a = nums[0]
    val b = nums[1]

    val result = mutableListOf(a,b)
    
    for(i in 2 until 10){
        val c = 2*result[i-2] + result[i-1]
        result.add(c)
    }

    print(result.joinToString(" "))

}