import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    for (i in 0 until N) {
        var result = 0
        var count = 1
        readLine().forEach {
            when(it) {
                'O' -> {
                    result += count
                    count++
                }
                'X' -> {
                    count = 1
                }
            }
        }
        println(result)
    }
}