fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}.sorted()

    print(input[1])
}