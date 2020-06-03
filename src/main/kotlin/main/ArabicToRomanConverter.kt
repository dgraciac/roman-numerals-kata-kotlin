package main

private const val I = "I"
private const val V = "V"
private const val X = "X"
private const val L = "L"
private const val C = "C"
private const val D = "D"
private const val M = "M"
private const val IV = "$I$V"
private const val IX = "$I$X"
private const val XL = "$X$L"
private const val XC = "$X$C"
private const val CD = "$C$D"
private const val CM = "$C$M"

fun arabicToRoman(arabicNumeral: Int): String {
    return when {
        arabicNumeral == 0 -> ""
        arabicNumeral < 4 -> I.plus(arabicToRoman(arabicNumeral - 1))
        arabicNumeral == 4 -> IV
        arabicNumeral < 9 -> V.plus(arabicToRoman(arabicNumeral - 5))
        arabicNumeral == 9 -> IX
        arabicNumeral < 40 -> X.plus(arabicToRoman(arabicNumeral - 10))
        arabicNumeral == 40 -> XL
        arabicNumeral <= 49 -> XL.plus(arabicToRoman(arabicNumeral - 40))
        arabicNumeral < 90 -> L.plus(arabicToRoman(arabicNumeral - 50))
        arabicNumeral <= 99 -> XC.plus(arabicToRoman(arabicNumeral - 90))
        arabicNumeral < 400 -> C.plus(arabicToRoman(arabicNumeral - 100))
        arabicNumeral == 400 -> CD
        arabicNumeral <= 499 -> CD.plus(arabicToRoman(arabicNumeral - 400))
        arabicNumeral == 500 -> D
        arabicNumeral < 900 -> D.plus(arabicToRoman(arabicNumeral - 500))
        arabicNumeral == 900 -> CM
        arabicNumeral <= 999 -> CM.plus(arabicToRoman(arabicNumeral - 900))
        arabicNumeral == 1000 -> M
        arabicNumeral <= 4000 -> M.plus(arabicToRoman(arabicNumeral - 1000))
        else -> ""
    }
}
