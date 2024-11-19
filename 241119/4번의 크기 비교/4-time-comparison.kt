fun main() {
    val a = readLine()!!.toInt()
    val input = readLine()!!.split(" ").map { it.toInt() }

    val (b, c, d, e) = input

    println(if (a > b) 1 else 0)
    println(if (a > c) 1 else 0)
    println(if (a > d) 1 else 0)
    println(if (a > e) 1 else 0)
}