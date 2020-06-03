package main

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class ArabicToRomanConverterTest {
    companion object {
        @JvmStatic
        fun fixtures(): List<Arguments> =
            listOf(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(13, "XIII"),
                Arguments.of(14, "XIV"),
                Arguments.of(17, "XVII"),
                Arguments.of(24, "XXIV"),
                Arguments.of(34, "XXXIV"),
                Arguments.of(37, "XXXVII"),
                Arguments.of(39, "XXXIX"),
                Arguments.of(40, "XL"),
                Arguments.of(41, "XLI"),
                Arguments.of(42, "XLII"),
                Arguments.of(43, "XLIII"),
                Arguments.of(49, "XLIX"),
                Arguments.of(50, "L"),
                Arguments.of(74, "LXXIV"),
                Arguments.of(79, "LXXIX"),
                Arguments.of(89, "LXXXIX"),
                Arguments.of(97, "XCVII"),
                Arguments.of(100, "C"),
                Arguments.of(101, "CI"),
                Arguments.of(105, "CV"),
                Arguments.of(189, "CLXXXIX"),
                Arguments.of(190, "CXC"),
                Arguments.of(200, "CC"),
                Arguments.of(289, "CCLXXXIX"),
                Arguments.of(399, "CCCXCIX"),
                Arguments.of(400, "CD"),
                Arguments.of(444, "CDXLIV"),
                Arguments.of(499, "CDXCIX"),
                Arguments.of(500, "D"),
                Arguments.of(596, "DXCVI"),
                Arguments.of(782, "DCCLXXXII"),
                Arguments.of(900, "CM"),
                Arguments.of(994, "CMXCIV"),
                Arguments.of(999, "CMXCIX"),
                Arguments.of(1000, "M"),
                Arguments.of(2768, "MMDCCLXVIII"),
                Arguments.of(3888, "MMMDCCCLXXXVIII"),
                Arguments.of(4000, "MMMM")





            )
    }

    @ParameterizedTest
    @MethodSource("fixtures")
    fun `convert arabic numeral to roman numeral`(arabicNumeral: Int, expectedRomanNumeral: String) {
        val romanNumeral = arabicToRoman(arabicNumeral)
        assertThat(romanNumeral).isEqualTo(expectedRomanNumeral)
    }
}
