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
                Arguments.of(5, "V")
            )
    }

    @ParameterizedTest
    @MethodSource("fixtures")
    fun `convert arabic numeral to roman numeral`(arabicNumeral: Int, expectedRomanNumeral: String) {
        val romanNumeral = arabicToRoman(arabicNumeral)
        assertThat(romanNumeral).isEqualTo(expectedRomanNumeral)
    }
}
