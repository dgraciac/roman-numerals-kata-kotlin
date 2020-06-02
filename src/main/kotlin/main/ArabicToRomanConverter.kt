package main

private const val I = "I"
private const val V = "V"
private const val X = "X"
private const val L = "L"
private const val C = "C"
private const val D = "D"
private const val M = "M"
private const val IX = "$I$X"
private const val XL = "$X$L"
private const val XC = "$X$C"
private const val IV = "$I$V"

fun arabicToRoman(arabicNumeral: Int): String {
    return when {
        arabicNumeral == 0 -> ""
        arabicNumeral < 4 ->  I.plus(arabicToRoman(arabicNumeral - 1))
        arabicNumeral == 4 -> IV
        arabicNumeral < 9 ->  V.plus(arabicToRoman(arabicNumeral - 5))
        arabicNumeral == 9 -> IX
        arabicNumeral < 40 -> X.plus(arabicToRoman(arabicNumeral - 10))
        arabicNumeral == 40 -> XL
        arabicNumeral <= 49 -> XL.plus(arabicToRoman(arabicNumeral - 40))
        arabicNumeral < 90 ->  L.plus(arabicToRoman(arabicNumeral - 50))
        arabicNumeral <= 99 ->  XC.plus(arabicToRoman(arabicNumeral - 90))
        else -> "C"
    }
}

private fun dictionary() = mapOf(
    1 to "I",
    5 to "V",
    10 to "X",
    50 to "L",
    100 to "C"
)

private fun romanForArabicLesserThan(arabicNumeral: Int, increment: Int): String {
    return dictionary()[increment].plus(arabicToRoman(arabicNumeral - increment))
}
