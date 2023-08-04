fun main() {
    println("For loop");
    for(i in 1..10 step 1)
        print("$i ");
    println();
    println("For loop reverse");
    for(i in 10 downTo 1 step 1)
        print("$i ");
    println();
    println("While Loop");
    var i=0;
    while(i<10) {
        print("${i+1} ");
        i++;
    }
    println();
    println("do while");
    do {
        println("$i");
        i++;
    } while(i<10)
} 