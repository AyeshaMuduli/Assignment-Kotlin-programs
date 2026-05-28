// 8. Write a kotlin program to count the number of digits i a given integer.
fun main(){
    var num=12345
    var count=0
    if(num==0){
        count=1
    }
    else{
        while(num!=0){
        	num=num/10
        	count++
        }
    }
    println("number of digits is $count")
}
