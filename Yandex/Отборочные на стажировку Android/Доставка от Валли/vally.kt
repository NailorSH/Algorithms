// не прошло 5й тест

fun main() {
    val input = readLine()!!
    var crosswalkCount = 0
    var leftWalk = false
    var rightCrosswalk = false

    for (char in input) {
        when (char) {
            '1' -> {
                if (!leftWalk) {
                    crosswalkCount++
                    leftWalk = true
                }
                rightCrosswalk = false
            }
            '2' -> {
                if (!rightCrosswalk) {
                    crosswalkCount++
                    rightCrosswalk = true
                }
                leftWalk = false
            }
            '3' -> {
                if (!leftWalk || !rightCrosswalk) {
                    crosswalkCount++
                    leftWalk = true
                    rightCrosswalk = true
                }
            }
        }
    }

    println(crosswalkCount)
}

