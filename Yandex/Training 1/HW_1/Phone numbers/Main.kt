import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val newNumber = scanner.nextLine().filterNot { it == '-' || it == '(' || it == ')'}
    val numbers = mutableListOf<String>()
    repeat(3) {
        numbers.add(scanner.nextLine().filterNot { it == '-' || it == '(' || it == ')'})
    }

    val newNumberPiece: String = when {
        newNumber[0] == '+' -> newNumber.drop(2)
        newNumber[0] == '8' -> newNumber.drop(1)
        newNumber.length == 7 -> "495$newNumber"
        else -> newNumber
    }

    for (number in numbers) {
        val oneNumberPiece: String = when {
            number[0] == '+' -> number.drop(2)
            number[0] == '8' -> number.drop(1)
            number.length == 7 -> "495$number"
            else -> number
        }

        if(newNumberPiece == oneNumberPiece) println("YES")
        else println("NO")
    }
}
