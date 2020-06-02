package main

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.lang.UnsupportedOperationException

class ArabicToRomanConverterTest {

    @Test
    fun `convert 1 to I`() {
        val result = arabicToRomanNumeral(1)
        assertThat(result).isEqualTo("I")
    }

    @Test
    fun `convert 2 to II`() {
        val result = arabicToRomanNumeral(2)
        assertThat(result).isEqualTo("II")
    }

    private fun arabicToRomanNumeral(arabicNumeral: Int): String {
        return if (arabicNumeral == 1) {
            "I"
        } else "II"

    }
}