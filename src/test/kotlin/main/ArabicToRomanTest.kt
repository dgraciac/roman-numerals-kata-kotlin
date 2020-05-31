package main

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArabicToRomanTest {

    @Test
    fun `converts 1`() {
        arabicToRoman(1).let {
            assertThat(it).isEqualTo("I")
        }
    }

    @Test
    fun `converts 2`() {
        arabicToRoman(2).let {
            assertThat(it).isEqualTo("II")
        }
    }

    private fun arabicToRoman(arabic: Int): String {
        return if (arabic == 1) "I" else "II"
    }
}