fun main(){
    var sum = 0
    var i=0

    while(true){
        val a = readLine()!!.toInt()
    
        if(a>=30 || a<20){
            break
        }
        i++
        sum+=a
    }

    val average = sum / i.toDouble()
    println("%.2f".format(average))
}