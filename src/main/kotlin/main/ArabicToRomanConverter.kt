package main

fun arabicToRoman(arabicNumeral: Int): String {
    val dictionary = dictionary()

    return when {
        arabicNumeral == 0 -> ""
        arabicNumeral < 4 ->  romanForArabicLesserThan(arabicNumeral, 1)
        arabicNumeral == 4 -> dictionary[1].plus(dictionary[arabicNumeral + 1])
        arabicNumeral < 9 ->  romanForArabicLesserThan(arabicNumeral, 5)
        arabicNumeral == 9 -> dictionary[1].plus(dictionary[arabicNumeral + 1])
        else -> romanForArabicLesserThan(arabicNumeral,10)
    }
}

private fun dictionary() = mapOf(1 to "I", 5 to "V", 10 to "X")

private fun romanForArabicLesserThan(arabicNumeral: Int, bla: Int): String {
    return dictionary()[bla].plus(arabicToRoman(arabicNumeral - bla))
}
