import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val roomTemp = scanner.nextInt()
    val condTemp = scanner.nextInt()
    val mode = scanner.next()

    var resultTemp = 0

    when (mode) {
        "freeze" -> {
            resultTemp = if (roomTemp > condTemp) condTemp else roomTemp
        }

        "heat" -> {
            resultTemp = if (roomTemp < condTemp) condTemp else roomTemp
        }
        "auto" -> resultTemp = condTemp
        "fan" -> resultTemp = roomTemp
    }

    println(resultTemp)
}