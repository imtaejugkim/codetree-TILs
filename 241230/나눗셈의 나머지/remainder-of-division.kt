fun main() {
    val nums = readLine()!!.split(" ").map { it.toInt() }
    var a = nums[0]
    val b = nums[1]

    // 나누는 값보다 나머지가 클 수 없음
    val remainderCounts = IntArray(b) { 0 }

    while (a > 0) {
        val remainder = a % b
        remainderCounts[remainder]++ 
        a /= b 
    }

    // lit.sumbOf {} : 람다 함수 내에서 해당 index 참조 가능, 각 index를 더함
    val result = remainderCounts.sumOf { it * it }
    println(result)
}