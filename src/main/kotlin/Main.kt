import array.Q13

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val s = Q13.Solution()
    val i1 = "III"
    val i2 = "LVIII"
    val i3 = "MCMXCIV"

    println("Program arguments: ${s.romanToInt(i1)}")
    println("Program arguments: ${s.romanToInt(i2)}")
    println("Program arguments: ${s.romanToInt(i3)}")

}