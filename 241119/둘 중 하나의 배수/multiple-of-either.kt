fun main(){
    val a = readLine()!!.toInt()

    if(a%3==0 || a%5==0){
        print("1")
    } else {
        print("0")
    }
}