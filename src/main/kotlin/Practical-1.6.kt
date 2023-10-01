import java.util.Scanner
fun main(){
    var reader = Scanner(System.`in`)
    print("Enter num1 : ")
    var num1 = reader.nextDouble()
    print("Enter num2 : ")
    var num2 = reader.nextDouble()
    var sum = add(num1 , num2)
    var x = sub(num1, num2)
    var y = mul(num1, num2)
    var z = div(num1, num2)
    println("Sum is $sum")
    println("Sub is $x")
    println("Mul is $y")
    println("Div is $z")
}
fun add(num1 : Double , num2: Double) : Double {
    return num1 + num2
}
fun mul(num1 : Double , num2: Double) : Double{
    return num1*num2
}
fun div(num1: Double , num2: Double): Double{
    return num1/num2
}
fun sub(num1: Double , num2: Double):Double{
    return num1 - num2
}
