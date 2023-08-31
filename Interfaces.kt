
// interfaces can be created using keyword interface
// these can't be instantiated, but inherited
interface AnInterface {
    var x: Int;
    fun func1() : Int;
    fun func2(): Int;
}

interface AnotherInterface {
    var y: Int;
}

// inherited same way as classes
// anyclass that does not ovverride everything must be declared abstract
abstract class AClass() : AnInterface, AnotherInterface {
    override x= 10;
    override y= 3;
    override fun func1() : Int {
        println("In fn 1");
        return 0;
    }
}

class AnotherClass(): AClass {
    ovverride fun func2() : Int {
        println("In fun 2");
        return 0;
    }
}

