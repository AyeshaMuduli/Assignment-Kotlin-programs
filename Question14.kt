// 14. Write a kotlin program to print all prime numbers from 1 to N.
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false

    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    val n = 50
	println("prime numbers from 1 to $n is:")
    for (num in 2..n) {
        if (isPrime(num)) {
            print("$num ")
        }
    }
}
