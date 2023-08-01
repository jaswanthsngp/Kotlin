fun main () {
    val a: Int= 234;                // Byte, Short, UByte, UShort also exist
    val b: Long= 100_100_000_000;   // ULong for unsigned long
    // Operations: +-*/%, += -= *= /= %=, ++ --
    val c: Char= 'c';
    val d: Double= 3.14;            // Float exists too
    val e: String= "A string";
    val f: Boolean= true;
    // Operations: && || !
    // Bitwise Operators: shr, shl, ushr, and, or, xor, inv; Usage: a.and(b);
    println("${a}, ${b}, ${c}, ${d}, ${e}, ${f}");
}