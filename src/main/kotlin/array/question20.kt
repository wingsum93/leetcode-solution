package array

class Q20 {
    class Solution {
        val openList = arrayListOf('(', '{', '[')
        val closeList = arrayListOf(')', '}', ']')
//        fun isValid(s: String): Boolean {
//            if (s.length%2==0) return false
//            for (i in s.indices){
//                val openIndex = openList.indexOf(s[i])
//                if (openIndex<0) return false
//
//            }
//        }
    }

    companion object {
        val i1 = "()"
        val i2 = "()[]{}"
        val i3 = "(]"
    }
}