import kotlin.reflect.typeOf

fun main(){

    println("Abhay Hingrajiya 22012012024")
    print("Enter a Number: ")
    var x= readLine()
    var num:Int=x!!.toInt()
    if(num%2==0)
        println("Number is Even")
    else
        println("Number is Odd")
}