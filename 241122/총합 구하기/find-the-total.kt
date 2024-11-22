fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}

    val (a,b) = input
    var sum = 0

    for(i in a..b){
        if(i%6==0 && i%8!=0){
            sum+=i
        }
    }
    print(sum)
}