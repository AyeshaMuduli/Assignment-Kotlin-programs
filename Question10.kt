fun checkChar(ch: Char): String {
    return when (ch) {
        'a', 'e', 'i', 'o', 'u',
        'A', 'E', 'I', 'O', 'U' -> "Vowel"
        else -> "Consonant"
    }
}

fun main() {
    var ch = 'e'   // change this value

    println("$ch is a ${checkChar(ch)}")
}
