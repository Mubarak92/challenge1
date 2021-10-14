fun getsmallest(number1:Double,number2:Double,number3:Double): Double {

    var smallest = number1

    if (smallest >= number2) {
        smallest = number2
    }
    if (smallest >= number3)
    {
        smallest = number3

    }
    return smallest
}
fun getbiggest(number1:Double,number2:Double,number3:Double):Double {

    var biggest = number1

    if (biggest <= number2) {
        biggest = number2
    }
    if (biggest <= number3) {
        biggest = number3

    }
    return biggest
}
fun getmid(number1:Double,number2:Double,number3:Double):Double{
    var smallest=getsmallest(number1, number2, number3)
    var biggest=getbiggest(number1, number2, number3)

    var mid=0.0
    if (number1 < biggest && number1 > smallest ){
        mid= number1
    }
    else if(number2 < biggest && number2 > smallest) {
        mid = number2
    }
    else {
        mid = number3

    }
    return mid
}
