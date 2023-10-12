import array.Q217

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val s = Q217.Solution()
    val i1 = Q217.i1
    val i2 = Q217.i2
    val i3 = Q217.i3

    println("Program arguments: ${s.containsDuplicate(i1)}")
    println("Program arguments: ${s.containsDuplicate(i2)}")
    println("Program arguments: ${s.containsDuplicate(i3)}")

}