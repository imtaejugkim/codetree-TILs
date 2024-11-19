fun main(){
    val moneyString = readLine()
    val money = moneyString!!.toInt()
    if(money>3000){
        print("book")
    }else if(money>1000){
        print("book")
    }else {
        print("no")
    }
}