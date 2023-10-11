import array.Solution

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val s = Solution()
    val input1 = intArrayOf(2, 7, 11, 15)
    val input2 = intArrayOf(3, 2, 4)
    val input3 = intArrayOf(3, 3)

    val target = 6
    println("Program arguments: ${s.twoSum(input1, 9).toGsonString()}")
    println("Program arguments: ${s.twoSum(input2, 6).toGsonString()}")
    println("Program arguments: ${s.twoSum(input3, 6).toGsonString()}")

}