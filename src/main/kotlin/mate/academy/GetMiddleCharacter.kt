package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    return when {
        length == 0 -> ""
        length % 2 == 0 -> originalString[originalString.length / 2 - 1].toString()
            .plus(originalString[originalString.length / 2].toString())
        else -> originalString[originalString.length / 2].toString()
    }
}
