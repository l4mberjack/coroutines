fun main(){
    val numbers = listOf(1,0,1,1)
    val k = 1
    var status: Boolean = false
    val start = System.nanoTime()
    for (i in 0 .. numbers.size-1) {
        for (j in  i + 1..numbers.size-1) {
            if (numbers[i] == numbers[j] && j - i <= k)
                status = true
            else
                status = false
        }
    }
    val end = System.nanoTime() - start
    println(status)
    println("Затрачено времени ${end/1000000.0} мс")
}