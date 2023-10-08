fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val mentionCount = mutableMapOf<String, Int>()

    repeat(n) {
        val name = readln()
        val message = readln()

        val mentions = message.split(" ").count { it == "goose" }
        mentionCount[name] = mentionCount.getOrDefault(name, 0) + mentions
    }

    val sanctionedUsers = mutableListOf<String>()

    for ((user, mentions) in mentionCount) {
        if (mentions >= k) {
            sanctionedUsers.add(user)
        }
    }

    sanctionedUsers.sort()

    println(sanctionedUsers.size)
    for (user in sanctionedUsers) {
        println(user)
    }
}

