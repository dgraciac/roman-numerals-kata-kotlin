package main

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class ArabicToRomanConverterTest {
    @ParameterizedTest
    @MethodSource("fixtures")
    fun `convert arabic numeral to roman numeral`(arabicNumeral: Int, expectedRomanNumeral: String) {
        val romanNumeral = arabicToRomanNumeral(arabicNumeral)
        assertThat(romanNumeral).isEqualTo(expectedRomanNumeral)
    }

    private fun arabicToRomanNumeral(arabicNumeral: Int): String =
        when (arabicNumeral) {
            1 -> "I"
            2 -> "II"
            else -> "III"
        }

    companion object {
        @JvmStatic
        fun fixtures(): List<Arguments> =
            listOf(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III")
            )
    }
}
