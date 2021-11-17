import java.io.File

fun main() {
}

val alphabet = listOf(
    't', 'j', 'i', 'q', 'x', 'l', 'v', 's', 'n', 'e', 'd', 'w', 'b',
    'a', 'p', 'm', 'u', 'k', 'o', 'z', 'g', 'r', 'c', 'f', 'h', 'y'
)

val theKingJamesBible =
    File("/home/marcusd/IdeaProjects/learnKotlin/src/main/resources/theKingJamesBible.txt")

//    println("there are ${theKingJamesBible.readLines().size} lines in the king james bible")