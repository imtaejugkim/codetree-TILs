fun main(){
    val input = readLine()!!.trim()
    val nums = input.split(" ").map { it.toInt() }

    for(i in 1 until nums.size){
        if(nums[i]%3==0){
            println(nums[i-1])
            return 
        }
    }
}