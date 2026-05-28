//12. Write a program to swap two numbers -using third variable.
fun main() {
    var a = 10
    var b = 20

    println("Before swapping: a = $a, b = $b")

    var c = a
    a = b
    b = c

    println("After swapping: a = $a, b = $b")
}
