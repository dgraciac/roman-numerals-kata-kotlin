Given a positive integer number lesser than 4000 determine its Roman numeral representation as a String.
### First Iteration:

Given a positive integer number **lesser or equal to 10**
 determine its Roman numeral representation as a String

```
Examples
* 1 -> "I"
* 2 -> "II"
* 3 -> "III"
* 4 -> "IV"
* 5 -> "V"
* 6 -> "VI"
* 7 -> "VII"
* 8 -> "VIII"
* 9 -> "IX"
* 10 -> "X"
```
 
### Second Iteration:

Given a positive integer number **lesser or equal to 50** 
determine its Roman numeral representation as a String

```
Examples
* 10 -> "X"
* 17 -> "XVII"
* 20 -> "XX"
* 24 -> "XXIV"
* 27 -> "XXVII"
* 30 -> "XXX"
* 34 -> "XXXIV"
* 40 -> "XL"
* 50 -> "L"
```

### Third Iteration:

Given a positive integer number *lesser or equal to 100*
determine its Roman numeral representation as a String

```
Examples
* 42 -> "XLII"
* 43 -> "XLIII"
* 49 -> "XLIX"
* 74 -> "LXXIV"
* 89 -> "LXXXIX"
* 97 -> "XCVII"
* 100 -> "C"
```

### Fourth Iteration:

Given a positive integer number *lesser or equal to 100*
determine its Roman numeral representation as a String

```
Examples
* 42 -> "XLII"
* 43 -> "XLIII"
* 49 -> "XLIX"
* 74 -> "LXXIV"
* 89 -> "LXXXIX"
* 97 -> "XCVII"
* 100
```

### Fifth Iteration:

Given a positive integer number *lesser or equal to 500*
determine its Roman numeral representation as a String

```
Examples
* 190, "CXC"
* 200, "CC"
* 289, "CCLXXXIX"
* 399, "CCCXCIX"
* 400, "CD"
* 444, "CDXLIV"
* 499, "CDXCIX"
* 500, "D"
```

### Sixth Iteration:

Given a positive integer number *lesser or equal to 1000*
determine its Roman numeral representation as a String

```
Examples
* 596, "DXCVI"
* 782, "DCCLXXXII"
* 900, "CM"
* 994, "CMXCIV"
* 999, "CMXCIX"
* 1000, "M"
```
### Seventh Iteration:

Given a positive integer number *lesser or equal to 4000*
determine its Roman numeral representation as a String

```
Examples
* 2768, "MMDCCLXVIII"
* 3888, "MMMDCCCLXXXVIII"
* 4000, "MMMM"

```

## Transformation Priority

    ({}–>nil) no code at all->code that employs nil
    (nil->constant)
    (constant->constant+) a simple constant to a more complex constant
    (constant->scalar) replacing a constant with a variable or an argument
    (statement->statements) adding more unconditional statements.
    (unconditional->if) splitting the execution path
    (scalar->array)
    (array->container)
    (statement->recursion)
    (if->while)
    (expression->function) replacing an expression with a function or algorithm
    (variable->assignment) replacing the value of a variable.




Examples:

* 1 -> "I" | 10 -> "X" | 100 -> "C" | 1000 -> "M"
* 2 -> "II" | 20 -> "XX" | 200 -> "CC" | 2000 -> "MM"
* 3 -> "III" | 30 -> "XXX" | 300 -> "CCC" | 3000 -> "MMM"
* 4 -> "IV" | 40 -> "XL" | 400 -> "CD"
* 5 -> "V" | 50 -> "L" | 500 -> "D"
* 6 -> "VI" | 60 -> "LX" | 600 -> "DC"
* 7 -> "VII" | 70 -> "LXX" | 700 -> "DCC"
* 8 -> "VIII" | 80 -> "LXXX" | 800 -> "DCCC"
* 9 -> "IX" | 90 -> "XC" | 900 -> "CM"
* 1990 -> "MCMXC" (1000 -> "M" + 900 -> "CM" + 90 -> "XC")
* 2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
* 99 -> "XCIX" (90 -> "XC" + 9 -> "IX")
* 47 -> "XLVII" (40 -> "XL" + 7 -> "VII")
* 3888 -> "MMMDCCCLXXXVIII" (3000 -> "MMM" + 800 -> "DCCC" + 80 -> "LXXX" + 8 -> "VIII")

Examples:

* 1 -> "I" | 10 -> "X" | 100 -> "C" | 1000 -> "M"
* 2 -> "II" | 20 -> "XX" | 200 -> "CC" | 2000 -> "MM"
* 3 -> "III" | 30 -> "XXX" | 300 -> "CCC" | 3000 -> "MMM"
* 4 -> "IV" | 40 -> "XL" | 400 -> "CD"
* 5 -> "V" | 50 -> "L" | 500 -> "D"
* 6 -> "VI" | 60 -> "LX" | 600 -> "DC"
* 7 -> "VII" | 70 -> "LXX" | 700 -> "DCC"
* 8 -> "VIII" | 80 -> "LXXX" | 800 -> "DCCC"
* 9 -> "IX" | 90 -> "XC" | 900 -> "CM"
* 1990 -> "MCMXC" (1000 -> "M" + 900 -> "CM" + 90 -> "XC")
* 2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
* 99 -> "XCIX" (90 -> "XC" + 9 -> "IX")
* 47 -> "XLVII" (40 -> "XL" + 7 -> "VII")
* 3888 -> "MMMDCCCLXXXVIII" (3000 -> "MMM" + 800 -> "DCCC" + 80 -> "LXXX" + 8 -> "VIII")