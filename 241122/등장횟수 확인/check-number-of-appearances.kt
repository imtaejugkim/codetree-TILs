fun main(){
    var check = 0

    repeat(5){
        val a = readLine()!!.toInt()
        if(a%2==0){
            check+=1
        }
    }
    print(check)
}