fun main(){
    val a = readLine()!!.split(" ")
    val a1 = a[0].toInt()
    val a2 = a[1]

    val b = readLine()!!.split(" ")
    val b1 = b[0].toInt()
    val b2 = b[1]

    if((a2=="M" && a1 >=19) || (b2=="M" && b1 >=19)){
        print("1")
    } else {
        print("0")
    }

}