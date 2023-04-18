import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if(a+b > c && b+c > a && a+c > b) println("YES")
    else  println("NO")
}
