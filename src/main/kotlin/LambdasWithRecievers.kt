class HTML {
    fun body() { println("I am in the body of HTML") }
}

fun HTML.html(init: HTML.() -> Unit): HTML {
    this.init()        // pass the receiver object to the lambda
    return this
}
fun main() {
    var htmlObject = HTML()
    htmlObject.html { body()}
}