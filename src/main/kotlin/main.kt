val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    println("Введите сумму перевода в рублях")
    val amount = scan.nextInt() * 100
    val comission = (amount * 0.0075).toInt()
    val minComission = 3500
    val totalComission = if(comission < minComission) minComission else comission
    println("Комиссия за ваш перевод составит $totalComission коп.")
}