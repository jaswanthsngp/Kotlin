fun main() {
    // listOf operator is used to create immutable lists, similar to arrays
    // mutableListOf is used to create mutable lists
    val l= mutableListOf(1, 3, 4, 5, 6);
    // accessing elements is same as arrays
    println("${l[0]} ${l.get(0)}");
    // but you can also find the indices
    println("${l.indexOf(1)} ${l.indexOf(0)}");
    // iterate over with foreach loop
    for(i in l)
        print("$i ");
    println();
    // you can append elements to list
    l.add(7);
    // or into an index
    l.add(1, 2);
    for(i in l)
        print("$i ");
    println();
    // you can remove the element
    l.remove(7);
    // or remove by index
    l.removeAt(1);
    // and check for the element too
    println(2 in l);
    println(4 in l);
}
