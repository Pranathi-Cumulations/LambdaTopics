//higher order functions are those that can take other ufnctions as parameters
//or can return a function

var lambda = {a: Int , b: Int -> a + b }

//taking lambda expression as a parameter
fun higherfunc( lmbd: (Int, Int) -> Int) {

    var result = lmbd(2,4)
    println("The sum of two numbers is: $result")
}


fun add(a: Int, b: Int): Int{
    var sum = a + b
    return sum
}

fun mul(a: Int, b: Int): Int{
    return a*b
}

fun higherReturnFunc():((Int, Int) -> Int){
    return ::mul
}

fun main(args: Array<String>) {
    higherfunc(lambda) //passing lambda as parameter
    higherfunc(::add) //passing  function as a parameter
    var multiply = higherReturnFunc()
    println(multiply(2,3))
}