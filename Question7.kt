// 7. Write a kotlin funtion to find the greatest among three numbers.
fun greatest(a: Int, b: Int, c: Int): Int{
    var max=a
    if(b>max){
        max=b
    }
    if(c>max){
        max=c
    }
    return max
}
fun main(){
    var n1=5
    var n2=9
    var n3=7
    val result=greatest(n1,n2,n3)
    println("greatest number is: $result")
}
