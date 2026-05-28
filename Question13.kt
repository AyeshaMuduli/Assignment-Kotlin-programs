// 13. Write a kotlin function to calculate simple interest using input value.
fun simpleInterest(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}

fun main() {
    val principal = 1000.0
    val rate = 5.0
    val time = 2.0

    val si = simpleInterest(principal, rate, time)

    println("Simple Interest is: $si")
}
