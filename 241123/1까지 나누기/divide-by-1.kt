fun main(){
    var input = readLine()!!.toInt()
    var i = 1


    while(true){
        input = input/i
        if(input<1){
            break
        } else{
            i++
        }
    }
    print(i)
}