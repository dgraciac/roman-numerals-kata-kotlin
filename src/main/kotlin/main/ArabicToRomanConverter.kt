package main

fun arabicToRoman(arabicNumeral: Int): String =
    when {
        arabicNumeral == 0 -> ""
        arabicNumeral < 4 -> "I".plus(arabicToRoman(arabicNumeral - 1))
        arabicNumeral == 4 -> "IV"
        else -> "V"
    }