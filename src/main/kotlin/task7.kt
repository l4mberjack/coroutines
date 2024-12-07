fun main(){
    val numbers = listOf(1,2,4,1)
    var count = 0
    var status: Boolean = false
    val start = System.nanoTime()
    for (i in 0 .. numbers.size-1) {
        for (j in 0..numbers.size-1)
            if (numbers[i] == numbers[j])
                count++
        if(count >= 2) {
            status = true
            break
        }
        else {
            status = false
            count = 0
        }
    }
    val end = System.nanoTime() - start
    println(status)
    println("Затрачено времени ${end/1000000.0} мс")
}