fun happyBirthDay( age : Int, name : String = "Jaswanth") : String {
    return "Happy Birthday $name, you are now $age years old!";
}

// recursion
fun fact(n: Int): Int {
    if(n<=1)
        return 1;
    return n*fact(n-1);
}

fun higherOrderFunction(aFunc:(Int, String)->String):(Int)->Int {
    // functions which take a fn as argument / which returns a function is called `Higher Order Function`
    println(aFunc(19, "JS"));
    return ::fact;
    // function is referenced using reference operator (`::`)
}

// inline is a good alternative to lambda
// these take a fn as argument and excecute it
// any fn getting excecuted as inline `can't return`
// to do so, the param must be declared `noinline`
// inline fun inlineFn(aFunc:()) {
//     aFunc();
// }

fun main() {
    println(happyBirthDay(19, "Kotlin"));
    println(happyBirthDay(19));
    println(happyBirthDay(name= "Kotlin", age=19));
    println(fact(5));
    // lambda expression
    val lambda: (Int, Int)->Int = {a, b-> a+b};
    val UnnamedArgsLambda: (Int) -> Int = {it}
    // for every lambda created, a class is defined and instantiated,
    // hendce increasing the workload
    println(lambda(2, 3));
    println(UnnamedArgsLambda(32));
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
    // calling a higher order function
    println(higherOrderFunction(::happyBirthDay)(5));
}
