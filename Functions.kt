fun happyBirthDay( age : Int, name : String = "Jaswanth") : String {
    return "Happy Birthday $name, you are now $age years old!";
}

// recursion
fun fact(n: Int): Int {
    if(n<=1)
        return 1;
    return n*fact(n-1);
}

fun main() {
    println(happyBirthDay(19, "Kotlin"));
    println(happyBirthDay(19));
    println(happyBirthDay(name= "Kotlin", age=19));
    println(fact(5));
    // lambda expression
    val lambda: (Int, Int)->Int = {a, b-> a+b};
    // for every lambda created, a class is defined and instantiated,
    // hendce increasing the workload
    println(lambda(2, 3));
    // kotlin supports anonymous functions too
    val noname= fun (name: String) {
        println("Hi $name!");
    }
    noname("Jaswanth");
    // the functions can also be assigned to variables
    val hbd= ::happyBirthDay;
    println(hbd(19, "Kotlin"));
    // strange, hbd won't work if you call without name (the default param)
    println(happyBirthDay(19));
}
