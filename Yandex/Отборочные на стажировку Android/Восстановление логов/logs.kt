fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val screens = readln().split(" ")
    val mainScreen = readln()

    val reachableScreens = mutableSetOf(mainScreen)
    val logs = mutableListOf<Pair<String, String>>()

    repeat(m) {
        val (from, to) = readln().split(" ")
        logs.add(Pair(from, to))
    }

    var changed = true
    while (changed) {
        changed = false
        val newScreens = HashSet<String>(reachableScreens)
        for ((from, to) in logs) {
            if (reachableScreens.contains(from) && !reachableScreens.contains(to)) {
                newScreens.add(to)
                changed = true
            }
        }
        reachableScreens.clear()
        reachableScreens.addAll(newScreens)
    }

    val unreachableScreens = screens.filter { !reachableScreens.contains(it) }
    println(unreachableScreens.size)
}

