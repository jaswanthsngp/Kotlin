class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    // forEach method is used to iterate over collections
    cookies.forEach {
        // it refers to current object
        println(it.name);
    }
    println();

    // map returns a new collection by processing the current
    // the collection returned by map has same size of its root
    val prices = cookies.map {
        "${it.name} costs $${it.price}"
    }
    prices.forEach {
        println(it);
    }
    println();

    // filter returns a collection satisfying some conditions
    val soft = cookies.filter {
        it.softBaked;
    }
    soft.forEach {
        println("${it.name} ${it.price}");
    }
    println();

    // group by groups the elements into various groups based on values
    // each group's value is represented by key and elements in a list
    // all groups are stored as a map
    val groups= cookies.groupBy {
        it.hasFilling;
    }
    println("The following has filling");
    groups[true]?.forEach {
        println("${it.name} ");
    }
    println()
    println("and following does not");
    groups[false]?.forEach {
        println("${it.name} ");
    }
    println();

    // folding is used to get a single value by reading all the elements
    // eg. sum, product, etc.
    var totalPrice = cookies.fold(0.0) { total, cookie ->
        total+cookie.price;
    }
    println("Buying all costs $$totalPrice");
    println();

    // you can also sort based on particular key
    val sorted= cookies.sortedBy {
        it.name;
    }
    println("Cookies, in alphabetical order")
    sorted.forEach {
        println(it.name);
    }
}
