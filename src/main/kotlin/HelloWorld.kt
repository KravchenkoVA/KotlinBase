fun main(args: Array<String>) {
    println("Hello World")
    println(max(1,2))
    val person = Person("Erick", false);
    person.isMarried = true;
    println(person.isMarried)

}

fun max(a: Int, b: Int): Int{
    return if (a>b) a else b
}
