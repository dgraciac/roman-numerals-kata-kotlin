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

    @Test
    fun `converts 3`() {
        arabicToRoman(3).let {
            assertThat(it).isEqualTo("III")
        }
    }

    private fun arabicToRoman(arabic: Int): String {
        return if (arabic == 1) "I" else "II"
    }
}