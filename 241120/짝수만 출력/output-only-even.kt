fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}

    for(i in input[0]..input[1] step 2){
        print("$i ")
    }
}