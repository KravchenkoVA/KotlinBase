import Color.*
import Expr.Num
import Expr.Sum
import geometry.shapes.Rectangle
import geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    println("Hello World")
    println(max(1, 2))
    val person = Person("Erick", false)
    person.isMarried = true
    println(person.isMarried)

    val rectangle = Rectangle(21, 25)
    println(rectangle.isSquare)
    println(createRandomRectangle().isSquare)
    println(getMnemonic(RED))
    println(mix(RED, YELLOW))
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))


}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun getMnemonic(color: Color) =
    when (color) {
        RED -> "КАждый"
        ORANGE -> "Охотник"
        YELLOW -> "Желает"
    }

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    else -> throw Exception("Грязь")
}

fun eval(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = eval(e.left)
            val right = eval(e.right)
            println("sum: $left+$right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown")
    }