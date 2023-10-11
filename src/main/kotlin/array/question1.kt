package array

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            var temp = target - nums[i]
            for (j in 0 until nums.size) {
                if (i == j) continue
                if (temp == nums[j]) return intArrayOf(i, j)
            }
        }
        return intArrayOf(-1, -1)
    }
}