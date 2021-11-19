import kotlin.random.Random

fun main() {
    // I've put explict type declarations here
    val x: Int? = null
    try {
        x!!
    } catch (e: NullPointerException) { // only way to get a NPE in koltin! (unless ur calling java)
        println("whoops")
    }

    val y: Int? = if (Random(100).nextBoolean()) {
        10
    } else {
        null
    }
    // the following would not compile as y could be null!
    // val z = y + 10

    // this does the same thing
    val z = y?.plus(10)

    // or we can assign a defualt
    val a = y ?: 0

    // a is 10 or 0 depending on our luck
}

fun httpMethodFromString(string: String): HttpMethod? {
    if (string == "get") {
        HttpMethod.Get
    }
    if (string == "put") {
        HttpMethod.Put
    }
    if (string == "post") {
        HttpMethod.Post
    }
    if (string == "delete") {
        HttpMethod.Delete
    }
    return null
}

enum class HttpMethod {
    Get,
    Post,
    Delete,
    Put;

    fun asLowercaseString(): String {
        return when (this) {
            Get -> "get"
            Post -> "post"
            Delete -> "delete"
            Put -> "put"
        }
    }
}