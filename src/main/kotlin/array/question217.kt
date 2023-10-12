package array

class Q217 {
    class Solution {
        fun containsDuplicate(nums: IntArray): Boolean {
            val hashSet = mutableSetOf<Int>()
            for (n in nums) {
                if (hashSet.contains(n)) return true
                hashSet.add(n)
            }
            return false
        }
    }

    companion object {
        val i1 = intArrayOf(1, 2, 3, 1)
        val i2 = intArrayOf(1, 2, 3, 4)
        val i3 = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
    }
}