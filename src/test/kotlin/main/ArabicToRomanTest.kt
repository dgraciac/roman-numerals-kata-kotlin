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

    private fun arabicToRoman(arabic: Int): String {
        TODO("Not yet implemented")
    }
}