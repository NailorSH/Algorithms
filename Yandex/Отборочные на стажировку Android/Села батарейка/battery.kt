fun main() {
    val n = readln().toInt()
    val appConsumption = readln().split(" ").map { it.toInt() }


    val totalConsumption = appConsumption.sum()
    val hours = 100 / totalConsumption

    println(hours)
}
