import java.util.*

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {

    greet("Krzys", "2022")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    // reading a name
    val yourName = scanner.nextLine()
    println("What a great name you have, $yourName!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()
    // val rem1 = scanner.nextInt()

    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is ${yourAge}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    // read a number and count to it here
    val counter = scanner.nextInt()
    for (i in 0..counter) {
        println("$i!")
    }
}
fun test() {
    TODO("Not yet implemented")
}

fun end() {
    println("Completed, have a nice day!")
}

/*
fun isGreater(a: Int, b: Int, c: Int, d: Int,) = a + b > c + d
println(isGreater(3,4,1,2))
 */