fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}

    val (a,b) = input

    if(a>0){
        for(i in 0..b-1){
            print("$a")
        }
    } else {
        print("0")
    }
}