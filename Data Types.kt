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
    var nullable: String?;
    nullable= null;
    // nullable variables are always to be accessed in safe mode - with a '?' with them
    println(nullable?.length);
    // Elivis Operator '?:' lets us return a default value if null
    println(nullable?.length?:0);
    nullable= "a string";
    // you can access them withuot '?' if you are sure it is not null
    println(nullable.length);
}
