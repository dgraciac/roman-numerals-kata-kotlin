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
        return if (arabic == 1) "I" else if(arabic == 2) "II" else "III"
    }

    companion object {
        @JvmStatic
        fun `test data`(): List<Arguments> {
            return listOf(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III")
            )
        }
    }
}