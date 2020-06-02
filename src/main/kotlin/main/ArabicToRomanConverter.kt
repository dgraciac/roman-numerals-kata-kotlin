package main

fun arabicToRoman(arabicNumeral: Int): String {
    val dictionary = mapOf(1 to "I", 5 to "V", 10 to "X")

    return when {
        arabicNumeral == 0 -> ""
        arabicNumeral < 4 -> "I".plus(arabicToRoman(arabicNumeral - 1))
        arabicNumeral == 4 -> dictionary[1].plus(dictionary[arabicNumeral + 1])
        arabicNumeral < 9 -> "V".plus(arabicToRoman(arabicNumeral - 5))
        arabicNumeral == 9 -> dictionary[1].plus(dictionary[arabicNumeral + 1])
        arabicNumeral < 14 -> "X".plus(arabicToRoman(arabicNumeral - 10))
        else -> "XIV"
    }
}