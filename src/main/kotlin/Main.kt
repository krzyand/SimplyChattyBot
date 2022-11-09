import java.util.*

fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")

    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    val yourName = scanner.nextLine()
    println("What a great name you have, $yourName!")
    println("Let me guess your age.\n" +
            "Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()
    // val rem1 = scanner.nextInt()

    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is ${yourAge}; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    // read a number and count to it here
    val counter = scanner.nextInt()
    for (i in 0..counter) {
        println("$i!")
    }
    println("Completed, have a nice day!")

    println(isGreater(3,4,1,2))

}

fun isGreater(a: Int, b: Int, c: Int, d: Int,) = a + b > c + d