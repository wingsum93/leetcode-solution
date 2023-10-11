package array

class Q13 {
    class Solution {
        val myMap = hashMapOf(
            Pair('I', 1),
            Pair('V', 5),
            Pair('X', 10),
            Pair('L', 50),
            Pair('C', 100),
            Pair('D', 500),
            Pair('M', 1000)
        )

        fun romanToInt(s: String): Int {
            var result = 0
            for (i in s.indices) {
                val currentValue = myMap.getValue(s[i])
                // have next character?
                if (i + 1 >= s.length) {
                    result += currentValue
                } else {
                    val nextValue = myMap.getValue(s[i + 1])
                    if (nextValue > currentValue) {
                        result -= currentValue
                    } else {
                        result += currentValue
                    }
                }
            }
            return result
        }
    }
}