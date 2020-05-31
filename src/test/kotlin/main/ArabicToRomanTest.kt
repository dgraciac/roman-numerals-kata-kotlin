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
        return when {
            arabic < 4 -> {
                repeat(arabic) { roman = roman.plus("I") }
                roman
            }
            arabic == 4 -> "IV"
            arabic < 9 -> "V".plus(arabicToRoman(arabic - 5))
            else -> "IX"
        }
    }

    companion object {
        @JvmStatic
        fun `test data`(): List<Arguments> {
            return listOf(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(8, "VIII"),
                Arguments.of(9, "IX")
            )
        }
    }
}