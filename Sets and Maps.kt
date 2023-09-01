fun main() {
    // set is a collection of non-repeating values, which can be accessed in O(1)
    val s = mutableSetOf(1, 2, 3, 6);
    // size of a set, same for other collections too
    println(s.size);
    // you can add to sets
    s.add(5);
    // check if it exists
    println(s.contains(5));
    // remove from sets
    s.remove(5);
    println(s.contains(5));

    // map contains unique keys and a value assigned to each key
    val m= mutableMapOf(
        // here, 1 is key and "one" is value
        1 to "One",
        2 to "Two",
        5 to "Five"
    )
    // map has a size attribute
    println(m.size);
    // keys can ba accessed
    println(m[1]);
    // added
    m.put(3, "Three");
    println(m[3]);
    // removed
    m.remove(3);
    println(m[3]);
    // and values can be changed
    m[5]= "V";
    println(m[5]);
}
