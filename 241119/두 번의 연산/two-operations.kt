fun main(){
    val inputString = readLine()
    var a = inputString!!.toInt()

    if(a%2 != 0){
        a+=3
    }

    if(a%3==0){
        a/=3
    }

    print(a)
}