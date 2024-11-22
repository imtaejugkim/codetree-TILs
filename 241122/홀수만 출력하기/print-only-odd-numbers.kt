fun main(){
    val n = readLine()!!.toInt()

    repeat(n){
        val a = readLine()!!.toInt()
        if(a%2!=0 && a%3==0){
            println(a)
        }
    }

}