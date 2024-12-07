fun main(){
    val numbers = listOf(1,3,3)
    var count = 0
    var selectNum: Int = 0
    val n = numbers.size
    val start = System.nanoTime()
    for (i in 0 .. numbers.size-1) {
        selectNum = numbers[i]
        for (j in 0..numbers.size-1)
            if (numbers[i] == numbers[j])
                count++
        if(count > n/2) {
            selectNum = numbers[i]
            break
        }
        else
            count = 0
    }
    val end = System.nanoTime() - start
    println(selectNum)
    println("Затрачено времени ${end/1000000.0} мс")
}