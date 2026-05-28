// 3. Write a kotlin function to find the sum of all numbers from 1 to N.
fun sum(n: Int): Int{
    var total=0
    for(i in 1..n){
        total+=i
    }
    return total
}

fun main(){
    val n=10
    
    println("sum from 1 to $n is ${sum(n)}")
}
