fun main() {


    println ("Enter numbers")
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    var smallest = number1

      if (smallest >= number2) {
        smallest = number2
     }
     if (smallest >= number3)
    {
        smallest = number3
    }
    //----------------------
    var biggest = number1
     if (biggest <= number2) {
       biggest= number2
    }
     if (biggest <= number3)
    {
        biggest=number3

    }
    
    var mid = 0
    if ((number1 < number2 && number1 > number3 || number1 > number2 && number1 < number3))
    mid = number1

    if ((number2 < number1 && number2 > number3 || number2 > number1 && number2 < number3))
        mid = number2

    if ((number3 < number1 && number3 > number2 || number3 > number1 && number3 < number2))
        mid = number3

    println("$smallest $mid $biggest")

}