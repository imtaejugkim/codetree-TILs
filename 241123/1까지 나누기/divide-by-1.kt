fun main(){
    var input = readLine()!!.toInt()
    var i = 0


    while(true){
        i++
        input = input/i
        if(input<=1){   
            break
        }
    }
    print(i)
}