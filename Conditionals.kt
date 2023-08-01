
fun withIfElse(age: Int): String {
    if(age<18)
        return "You are not eligible to vote yet";
    else if(age<23)
        return "Looks like you are voting for the first time";
    else 
        return "Welcome back to the elections";
}

// this works as switch case in other languages
fun withWhen(month: String): String {
    when(month) {
        "January" -> return "That's 1st month right!";
        "February" -> return "That's 2nd month right!";
        "March" -> return "That's 3rd month right!";
        "April" -> return "That's 4th month right!";
        "May" -> return "That's 5th month right!";
        "June" -> return "That's 6th month right!";
        "July" -> return "That's 7th month right!";
        "August" -> return "That's 8th month right!";
        "September" -> return "That's 9th month right!";
        "October" -> return "That's 10th month right!";
        "Noveber" -> return "That's 11th month right!";
        "December" -> return "That's 12th month right!";
        else -> return "That's not a month"
    }
}

fun main() {
    var age: Int;
    print("Enter your age\t");
    age= readln().toInt();
    var result= withIfElse(age);
    println(result);
    println("Enter the name of this month");
    result= withWhen(readln());
    println(result);
}
