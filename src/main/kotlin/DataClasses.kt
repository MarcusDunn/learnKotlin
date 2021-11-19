fun main() {

}
// equivalent and good data class
data class Location2(val latitude: Double, val longitude: Double, val alttidue: Double)

// bad normal class
class Location(val latitude: Double, val longitude: Double, val alttidue: Double) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Location

        if (latitude != other.latitude) return false
        if (longitude != other.longitude) return false

        return true
    }

    override fun hashCode(): Int {
        var result = latitude.hashCode()
        result = 31 * result + longitude.hashCode()
        return result
    }

    override fun toString(): String {
        return "Location(latitude=$latitude, longitude=$longitude)"
    }
}
