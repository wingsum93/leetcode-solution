import array.Q9

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val s = Q9.Solution()
    val i1 = 121
    val i2 = -121
    val i3 = 10
    val i4 = 11
    val i5 = 123454321

    println("Program arguments: ${s.isPalindrome(i1)}")
    println("Program arguments: ${s.isPalindrome(i2)}")
    println("Program arguments: ${s.isPalindrome(i3)}")
    println("Program arguments: ${s.isPalindrome(i4)}")
    println("Program arguments: ${s.isPalindrome(i5)}")

}