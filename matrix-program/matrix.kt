import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    // Uses the terminal to gain the information from the user
    // on the number of rows in the matrix
    println("Enter the number of rows: ")
    val rows = scan.nextInt()
    // Same as the other Scanner intake.
    println("Enter the number of columns: ")
    val columns = scan.nextInt()