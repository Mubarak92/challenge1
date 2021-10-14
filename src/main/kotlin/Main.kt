
fun sort (number1:Double, number2:Double, number3:Double, sort1:Boolean= true){
    val smallest = getsmallest(number1,number2,number3)
    val biggest = getbiggest(number1,number2,number3)
    val midEasy = getmidEasy(number1,number2,number3)
    val mid = getmid(number1,number2,number3)

    if (sort1  ){
        println("$smallest $midEasy $biggest")
        println ("mid from easy")
    }else{
        println("$smallest $mid $biggest")
        println ("mid from normal")
    }
}

fun main() {

    println("Enter numbers")
    val number1 = readLine()!!.toDouble()
    val number2 = readLine()!!.toDouble()
    val number3 = readLine()!!.toDouble()
    val sort1 = readLine()!!.toBoolean()

    sort(number1,number2,number3,sort1 )




    /* var smallest = getsmallest(number1,number2,number3)
       var biggest = getbiggest(number1,number2,number3)
       var mid = getmid(number1,number2,number3)*/
    //
// println("$smallest $mid $biggest")
}



    /* var smallest = number1

       if (smallest >= number2) {
         smallest = number2
      }
      if (smallest >= number3)
     {
         smallest = number3
     }*/
    //----------------------
    /*var biggest = number1
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

    /*if (number1 < biggest && number1 > smallest ){
        mid= number1
    }
    if(number2 < biggest && number2 > smallest) {
        mid = number2
    }
    else {
        mid = number3

    }
*/
    println("$smallest $mid $biggest")

}}*/