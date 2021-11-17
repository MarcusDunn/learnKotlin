fun main() {
    httpMethodFromString2("get")
}

fun httpMethodFromString2(string: String): HttpMethod2? = when (string.lowercase()) {
    HttpMethod2.Get.toLowercase() -> HttpMethod2.Get
    HttpMethod2.Post.toLowercase() -> HttpMethod2.Post
    HttpMethod2.Delete.toLowercase() -> HttpMethod2.Delete
    HttpMethod2.Put.toLowercase() -> HttpMethod2.Put
    else -> null
}

enum class HttpMethod2 {
    Get,
    Post,
    Delete,
    Put;

    fun toLowercase(): String {
        return when (this) {
            Get -> "get"
            Post -> "post"
            Delete -> "delete"
            Put -> "put"
        }
    }
}