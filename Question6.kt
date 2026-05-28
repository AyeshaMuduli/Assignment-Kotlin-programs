// 6. Write a program to find the factorial of number using a loop.
fun main(){
    var num=5
    var fact=1
    for(i in 1..num){
        fact=fact*i
    }
    println("factorial of number $num is $fact")
}
