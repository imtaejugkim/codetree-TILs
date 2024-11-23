fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}

    val (a,b) = input
    var result = 1

    for(i in a..b){
        if(i%a==0){
            result*=i
        }
    }

    print(result)
    
}