fun main() {
    HttpMethod2.getName()
}

enum class HttpMethod2 {
    Get,
    Post,
    Delete,
    Put;

    companion object {
        // essentially static
        fun getName(): String {
            return "httpmethod2"
        }
    }

    fun toLowercase(): String {
        return when (this) {
            Get -> "get"
            Post -> "post"
            Delete -> "delete"
            Put -> "put"
        }
    }
}