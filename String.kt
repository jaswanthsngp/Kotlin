fun main() {
    // a normal string
    val normal= "Hello\nWorld!";
    println(normal)
    // a raw string
    val raw= """Hello
        World!""";
    println(raw);
    // extra margin can be trimmed by using '|' to denote margin
    val rawWithoutMargin= """Hello
                        |World!""".trimMargin();
    println(rawWithoutMargin);
    // any charachter can by escaped by '\', except '$'
    // here is the special syntax for '$'
    println("${'$'}");
}
