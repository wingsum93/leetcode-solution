import array.Q905

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val s = Q905.Solution()
    val i1 = Q905.i1
    val i2 = Q905.i2
    val i3 = Q905.i3

    println("Program arguments: ${s.sortArrayByParity(i1).toGsonString()}")
    println("Program arguments: ${s.sortArrayByParity(i2).toGsonString()}")
    println("Program arguments: ${s.sortArrayByParity(i3).toGsonString()}")

}