fun main(){
    val numbers = IntArray(5){readLine()!!.toInt()}

    // all 은 모든 list를 확인하는 함수
    val threeNum = numbers.all{it%3==0}

    if(threeNum){
        print("1")
    }else{
        print("0")
    }
}