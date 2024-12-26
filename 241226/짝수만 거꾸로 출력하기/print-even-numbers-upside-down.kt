fun main(){
    val a = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map{it.toInt()}

    val envens = numbers.filter{it%2==0}

    println(envens.reversed().joinToString(" "))
}