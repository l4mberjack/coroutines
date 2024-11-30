fun main(){
    val numbers = listOf(8,1,2,10,3)
    val countMin = mutableListOf<Int>()
    var count = 0
    val start = System.nanoTime()
    for (i in 0 .. numbers.size-1) {
        for (j in 0..numbers.size-1)
            if ((numbers[j] < numbers[i]) && (numbers[j] != numbers[i]))
                count++
        countMin.add(count)
        count = 0
    }
    val end = System.nanoTime() - start
    println(countMin)
    println("Затрачено времени ${end/1000000.0} мс")
}