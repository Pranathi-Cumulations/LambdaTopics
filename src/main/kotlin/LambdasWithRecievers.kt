class HTML {
    fun body(str : String) { println("I am in the body of HTML") }
}

fun html(init: HTML.(String) -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init("hello")        // pass the receiver object to the lambda
    return html
}
fun main() {
    html { body("hi") }
}