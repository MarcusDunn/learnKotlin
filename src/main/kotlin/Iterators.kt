import java.io.File

fun main() {
    findTop10V1()
    findTop10V2()
}

// this is more advanced, but idiomatic kotlin that does the same thing
fun findTop10V2() {
    val top10 = theKingJamesBible
        .readText()
        .split(' ')
        .fold(HashMap<String, Int>()) { acc, s ->
            acc[s] = (acc[s] ?: 0) + 1
            acc
        }
        .toList()
        .sortedByDescending { it.second }
        .take(10)
        .map { it.first }
    println(top10)
}

// this is what we did in the presentation
private fun findTop10V1() {
    val hashMap = HashMap<String, Int>().toMutableMap()

    theKingJamesBible.readText()
        .split(' ')
        .forEach { word ->
            if (word in hashMap) {
                val i = hashMap[word]!!
                hashMap[word] = i + 1
            } else {
                hashMap[word] = 1
            }
        }

    val toList: List<Pair<String, Int>> = hashMap.toList()

    val selector: (Pair<String, Int>) -> Int? = { (word, occurrence) -> occurrence }
    val top10 = toList
        .sortedBy(selector)
        .reversed()
        .take(10)
        .map { (word, occurence) -> word }

    println(top10)
}

val alphabet = listOf(
    't', 'j', 'i', 'q', 'x', 'l', 'v', 's', 'n', 'e', 'd', 'w', 'b',
    'a', 'p', 'm', 'u', 'k', 'o', 'z', 'g', 'r', 'c', 'f', 'h', 'y'
)

val theKingJamesBible =
    File("/home/marcusd/IdeaProjects/learnKotlin/src/main/resources/theKingJamesBible.txt")

//    println("there are ${theKingJamesBible.readLines().size} lines in the king james bible")