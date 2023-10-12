package array

class Q905 {
    class Solution {
        fun sortArrayByParity(nums: IntArray): IntArray {
            for (i in nums.indices) {
                var firstIndex = i
                var lastIndex = nums.size - 1

                while (firstIndex < lastIndex && nums[firstIndex] % 2 == 0) {
                    firstIndex++
                }
                while (firstIndex < lastIndex && nums[lastIndex] % 2 != 0) {
                    lastIndex--
                }
                nums[firstIndex] = nums[lastIndex].also { nums[lastIndex] = nums[firstIndex] }
            }
            return nums
        }
    }

    companion object {
        val i1 = intArrayOf(3, 1, 2, 4)
        val i2 = intArrayOf(0)
        val i3 = intArrayOf(3, 66, 1, 2, 4)
    }
}