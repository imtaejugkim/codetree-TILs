fun main(){
    val n = readLine()?.toIntOrNull() ?: return println("잘못된 입력입니다.")
    
    // nums 값을 읽어올 때 null 체크 및 빈 리스트 체크
    val nums = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return println("잘못된 입력입니다.")
    
    // 숫자 개수와 실제 입력된 숫자 개수가 맞지 않으면 오류 처리
    if (nums.size != n) {
        return println("입력된 숫자의 개수와 n의 값이 맞지 않습니다.")
    }
    val envens = nums.filter{it%2==0}

    println(envens.reversed().joinToString(" "))
}