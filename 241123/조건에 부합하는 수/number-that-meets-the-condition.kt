fun main(){
    val input = readLine()!!.toInt()
    var a = 1
    
    while(a <= input){
        if(a%2==0 && a%4!=0){
            a++
            continue
        } else if((a/8)%2==0){
            a++
            continue
        } else if((a%7)<4){
            a++
            continue
        }
        print("$a ")
        a++
    }
}