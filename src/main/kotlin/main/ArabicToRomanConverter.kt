package main

fun arabicToRoman(arabicNumeral: Int): String {
    val simbolFor = dictionary()

    return when {
        arabicNumeral == 0 -> ""
        arabicNumeral < 4 ->  romanForArabicLesserThan(arabicNumeral, 1)
        arabicNumeral == 4 -> simbolFor[1].plus(simbolFor[5])
        arabicNumeral < 9 ->  romanForArabicLesserThan(arabicNumeral, 5)
        arabicNumeral == 9 -> simbolFor[1].plus(simbolFor[10])
        arabicNumeral < 40 -> romanForArabicLesserThan(arabicNumeral,10)
        arabicNumeral == 40 -> simbolFor[10].plus(simbolFor[50])
        arabicNumeral <= 49 -> simbolFor[10].plus(simbolFor[50].plus(arabicToRoman(arabicNumeral - 40)))
        arabicNumeral < 90 ->  romanForArabicLesserThan(arabicNumeral, 50)
        else -> "C"
    }
}

private fun dictionary() = mapOf(
    1 to "I",
    5 to "V",
    10 to "X",
    50 to "L")

private fun romanForArabicLesserThan(arabicNumeral: Int, increment: Int): String {
    return dictionary()[increment].plus(arabicToRoman(arabicNumeral - increment))
}
