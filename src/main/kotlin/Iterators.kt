import java.io.File

fun main() {
    findTop10V1()
    findTop10V2()
}

// this is more advanced, but idiomatic kotlin that does the same thing
fun findTop10V2() {
    val top10 = theKingJamesBible
        // to avoid having the full file in memory, we read line by line
        .readLines()
        // turn the line into words, use flatMap instead of map, so we still can pretend it's a massive list of words
        .flatMap { it.split(' ') }
        // We create a hashmap and populate it word by word.
        .fold(HashMap<String, Int>()) { hashmapAccumulator, word ->
            // if you figure out what this does, you've got nullability down!
            hashmapAccumulator[word] = (hashmapAccumulator[word] ?: 0) + 1
            // return the updated hashmap to the next iteration of fold
            hashmapAccumulator
        }
        // turn into a list as hashmaps are unordered so we can't sort
        .toList()
        // sort by the number of occurrences descending.
        .sortedByDescending { (_, occurrences) -> occurrences }
        // take the top 10
        .take(10)
        // remove the number of occurrences, so we only have the words
        .map { (word, _) -> word }
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