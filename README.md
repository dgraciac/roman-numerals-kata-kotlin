Given a positive integer number lesser than 4000 determine its Roman numeral representation as a String.

Examples:

* 1 -> "I" | 10 -> "X" | 100 -> "C" | 1000 -> "M"
* 2 -> "II" | 20 -> "XX" | 200 -> "CC" | 2000 -> "MM"
* 3 -> "III" | 30 -> "XXX" | 300 -> "CCC" | 3000 -> "MMM"
* 4 -> "IV" | 40 -> "XL" | 400 -> "CD" |
* 5 -> "V" | 50 -> "L" | 500 -> "D" |
* 6 -> "VI" | 60 -> "LX" | 600 -> "DC" |
* 7 -> "VII" | 70 -> "LXX" | 700 -> "DCC" |
* 8 -> "VIII" | 80 -> "LXXX" | 800 -> "DCCC" |
* 9 -> "IX" | 90 -> "XC" | 900 -> "CM" |

* 1990 -> "MCMXC" (1000 -> "M" + 900 -> "CM" + 90 -> "XC")
* 2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
* 99 -> "XCIX" (90 -> "XC" + 9 -> "IX")
* 47 -> "XLVII" (40 -> "XL" + 7 -> "VII")
* 3888 -> "MMMDCCCLXXXVIII" (3000 -> "MMM" + 800 -> "DCCC" + 80 -> "LXXX" + 8 -> "VIII")