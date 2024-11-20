fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}
    for(i in input[0]..input[1]){
        if(i%2==1){
            print("$i ")
        }
    }
}