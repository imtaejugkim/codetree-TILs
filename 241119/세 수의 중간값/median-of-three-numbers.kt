fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}
    val (a,b,c) = input

    if(b>a && b<c){
        print("1")
    } else {
        print("0")
    }
}