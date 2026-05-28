// 11. Write a program to find the sun of the digit of a number.
fun main() {
    var num = 789
    var sum = 0

    while (num != 0) {
        val digit = num % 10
        sum += digit
        num /= 10
    }

    println("Sum of digits is: $sum")
}
