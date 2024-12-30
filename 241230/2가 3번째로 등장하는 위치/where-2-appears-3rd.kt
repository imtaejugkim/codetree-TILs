fun main(){
    val a = readLine()!!.toInt()
    var count = 0
    val input = readLine()!!.trim().split(" ").map{it.toInt()}

    for(i in 0 until input.size){
        if(input[i]==2){
            count+=1
            if(count==3){
                println(i+1)
                break
            }
        }
    }
}