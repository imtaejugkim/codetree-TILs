fun main(){
    val input = readLine()!!.split(" ").map{it.toInt()}
    var (a,b) = input

    while(a<=b){
        if(1920%a==0&&2880%a==0){
            print("1")
            break
        }

        if(a==b){
            print("0")
            break
        }
        a++
    }
}