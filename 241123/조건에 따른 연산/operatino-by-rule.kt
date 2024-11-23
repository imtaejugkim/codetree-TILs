fun main(){
    var a = readLine()!!.toInt()
    var count = 0

    while(a<=1000){
        if(a%2==0){
            a=a*3+1
            count++
            continue
        } else if(a%2!=0){
            count++
            a=a*2+2
            continue
        }
    }
    print(count)
}