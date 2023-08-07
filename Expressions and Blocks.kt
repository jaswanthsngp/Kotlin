fun main() {
    // block/statement stands of itself
    if(1<2)
        println("yes, you are right");
    else
        println("no, you are wrong");
    // expression returns a value to be assigned to a variable
    val result= if(1<2) "yes you are right" else "no you are wrong";
    println(result);
}