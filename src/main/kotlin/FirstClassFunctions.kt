fun main() {
    // these are all the same (alomost)

    fun function1(char: Char): String {
        return "my char " + char
    }

    val function2: (Char) -> String = { char ->
        "my char " + char
    }

    val function3 = fun(char: Char): String {
        return "my char " + char
    }

    // sorta. the :: is fancy stuff that you'll know if you've dealt with enough java
    printEverything(alphabet, ::function1)
    printEverything(alphabet, function2)
    printEverything(alphabet, function3)

}

fun printEverything(list: List<Char>, function: (Char) -> String) {
    for (item in list) {
        val retuernedString = function(item)
        println(retuernedString)
    }
}