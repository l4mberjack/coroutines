
/* Дан массив целых чисел nums и целое число target, вернуть индексы двух чисел, чтобы их сумма давала target.
Предполагается, что каждый вход будет иметь ровно одно решение, и нельзя использовать один и тот же элемент дважды.
Вы можете возвращать ответ в любом порядке. Результат вернуть в виде массива */

fun main(){
    val numbers = listOf(8,1,2,2,3)
    val positions = mutableListOf<Int>()
    val target = 9
    val start = System.nanoTime()
    for (i in 0 .. numbers.size-1)
        for(j in 1 .. numbers.size-1)
            if(numbers[i] + numbers[j] == target) {
                positions.add(i)
                positions.add(j)
            }
    val end = System.nanoTime() - start
    println("Позиции: ${positions}")
    println("Затрачено времени ${end/1000000.0} мс")
}