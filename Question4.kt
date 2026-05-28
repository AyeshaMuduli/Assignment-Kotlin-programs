// 4. Write a program to reverse a given number using loops.
fun main(){
    var num=1234
    var rev=0
    while(num!=0){
        val digit=num % 10
        rev=rev*10+digit
        num=num/10
    }
    println("reversed number is: $rev")
}
