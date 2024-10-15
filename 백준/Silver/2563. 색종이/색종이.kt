import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val map = Array(101) { Array(101) { false } }
    var result = 0

    repeat(N) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }

        for (i in x until x + 10) {
            for (j in y until y + 10) {
                if (!map[i][j]) {
                    map[i][j] = true
                    result++
                }
            }
        }
    }
    println(result)
}