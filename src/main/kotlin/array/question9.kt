package array

class Q9 {
    class Solution {
        fun isPalindrome(number: Int): Boolean {
            if (number < 0) return false
            val digits = number.toString().map { it - '0' }
            val digitLength = digits.size
            val targetMax = digits.size / 2
            for (i in 0 until targetMax) {
                val isSameDigit = digits[i] == digits[digitLength - 1 - i]
                if (!isSameDigit) return false
            }
            return true

        }
    }
}