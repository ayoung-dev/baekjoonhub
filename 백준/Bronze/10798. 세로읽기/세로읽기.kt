import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var result = ""
    var arr = Array(5) { CharArray(15) {' '} }

    for (i in 0 until 5) {
        val input = next()
        arr[i] = input.toCharArray()
    }

    for (i in 0 until 15) {
        for (j in 0 until 5) {
            if (arr[j].getOrNull(i) != null) {
                result += arr[j][i]
            }
        }
    }

    println(result)
}