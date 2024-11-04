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
}
  val matrix = Array(rows) { IntArray(columns) }

    println("Enter the elements: ")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("Element [$i][$j] ")
            matrix[i][j] = scan.nextInt()
        }
    }

    printMatrix(matrix)
    findMinMaxRows(matrix)
    isSymmetricMatrix(matrix)
    val diagonalSum = diagonalSum(matrix)

    val transposedMatrix = transposeMatrix(matrix)
    printMatrix(transposedMatrix)


private fun isSymmetricMatrix(matrix: Array<IntArray>): Boolean {
    val transposedMatrix = transposeMatrix(matrix)
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            if (matrix[i][j] != transposedMatrix[i][j]) {
                return false
            }
        }
    }
    return true
}

fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val transposedMatrix = Array(matrix[0].size) { IntArray(matrix.size) }
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }
    return transposedMatrix
}

fun printMatrix(matrix: Array<IntArray>) {
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}

fun findMinMaxRows(matrix: Array<IntArray>) {
    for (i in matrix.indices) {
        var min = matrix[i][0]
        var max = matrix[i][0]
        for (j in 1 until matrix[i].size) {
            if (matrix[i][j] < min) {
                min = matrix[i][j]
            }
            if (matrix[i][j] > max) {
                max = matrix[i][j]
            }
        }
    }
}

fun diagonalSum(matrix: Array<IntArray>): Int {
    var diagonalSum = 0
    for (i in matrix.indices) diagonalSum += matrix[i][i]
    return diagonalSum
}

 