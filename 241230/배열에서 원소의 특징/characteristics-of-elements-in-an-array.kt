fun main(){
    val nums = readLine()!!.split(" ").map { it.toInt() }

    for(i in 1 until nums.size){
        if(nums[i]%3==0){
            println(nums[i-1])
            return 
        }
    }
}