fun main() {
    // same as java
    // String s = "hello world"
    val s = "hello world"

    // Int x = 8
    val x = 8

    // or worse yet, from the department of redundancy
    // HashMap<Int, String> hashmap = new HashMap<>()
    val hashmap = emptyMap<Int, String>()

    var y = 10

    // this is allowed due to `var`
    y = 10

    // this is not due to val
    // x = 10
}