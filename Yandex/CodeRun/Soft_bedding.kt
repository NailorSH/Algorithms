import java.util.Scanner

fun ok(h: Int, w: Int, list: List<Int>): Boolean {
    var iter = 0
    var nowSum = 0L
    var line = 0

    while (line < h && iter < list.size) {
        nowSum += list[iter]
        ++iter
        if(nowSum >= w) {
            nowSum = 0
            ++line
        }
    }

    return line == h
}

fun main() {
    val scanner = Scanner(System.`in`)

    val h: Int = scanner.nextInt()
    val n: Int = scanner.nextInt()
    val rugs = mutableListOf<Int>()

    repeat(times = n){
        rugs.add(scanner.nextInt())
    }

    var l = 0
    var r: Int = 1e9.toInt()

    while (l < r-1) {
        val m = r - (r - l) / 2

        if (ok(h, m, rugs)) l = m
        else r = m
    }

    println(l)
}