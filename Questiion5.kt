// 5. Write a kotlin program to check whether a number is a palindrome or not.
fun main(){
    var num=121
    var rev=0
    var org=num
    while(num!=0){
        val digit=num%10
        rev=rev*10+digit
        num=num/10
    } 
    if (org==rev){
        println("the number $rev is a palindrome.")
    }
    else{
        println("the number is not a palindrome")
    }
}
