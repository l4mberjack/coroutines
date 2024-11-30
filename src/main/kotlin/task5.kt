///*Дан массив nums, содержащий n различных чисел в диапазоне [0, n]. Вернуть единственное число в диапазоне, отсутствующее в массиве.*/
//import kotlin.random.Random
//fun main(){
//    print("Введите диапазон: ")
//    val n = readln().toInt()
//    val nums = listOf<Int>()
//    val allNums = arrayOf<Int>()
//
//    for (i in 0 .. n)
//        nums.add(Random.nextInt(0, n+1))
//
//    for (i in 0 .. n )
//        allNums.add(Random.nextInt(0, n+1))
//
//    var diffNum = allNums.subtract(nums)
//
//    println(nums)
//    println(allNums)
//    println("Недостающее число: ${diffNum}")
//}