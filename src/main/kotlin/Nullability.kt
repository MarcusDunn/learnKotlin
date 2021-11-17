fun main() {

}

fun httpMethodFromString(string: String): HttpMethod = TODO()

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