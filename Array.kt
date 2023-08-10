fun main() {
    // created with syntax
    val arr= arrayOf<Int>(1,2,3,4,5);
    // internal elements can be changed after creation, but not size
    println(arr[3]);
    arr[3]= 234;
    println(arr[3]);
    println("Array elements")
    for(i in arr)
        print("$i ");
    println();
    println("After reversing");
    arr.reverse();
    for(i in arr)
        print("$i ");
    println();
    println("After Shuffling");
    arr.shuffle();
    for(i in arr)
        print("$i ");
    println();
    println("After Sorting");
    arr.sort();
    for(i in arr)
        print("$i ");
    println();
}
