fun main() {
    printEverything(alphabet)
    printEverythingTwice(alphabet)
}

fun <T> printEverything(list: List<T>) {
    for (item in list) {
        println(item)
    }
}

fun <T> printEverythingTwice(list: List<T>) {
    for (item in list) {
        println("$item $item")
    }
}