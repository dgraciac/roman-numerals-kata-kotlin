package main

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class ArabicToRomanTest {

    @ParameterizedTest
    @MethodSource("test data")
    fun `converts arabic to roman`(arabic: Int, roman: String) {
        arabicToRoman(arabic).let {
            assertThat(it).isEqualTo(roman)
        }
    }

    private fun arabicToRoman(arabic: Int): String {
        var roman = ""
        return if (arabic < 4) {
            repeat(arabic) { roman = roman.plus("I") }
            roman
        } else if (arabic == 4) "IV"
        else "V"
    }

    companion object {
        @JvmStatic
        fun `test data`(): List<Arguments> {
            return listOf(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V")
            )
        }
    }
}