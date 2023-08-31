// class declaration holds the primary constructor
open class SmartDevice(name: String) {
    // ones that are declared in primary constructor doesn't need to be declared again
    var category:String= "Smart Device";
    var isOn:Boolean= false;
    /* Visibility of variables can be modified too (default is public)
        public - accessible anywhere
        internal - whithin module
        protected - whithin subclasses
        private - within calss
     */
    // secondary constructor, there can be multiple, but must call primary
    constructor (name: String, type: String) : this(name) {
        // param name and original name can't be same in kotlin
        category= type;
    }
    open fun turnOn() {
        isOn= true;
        println("Device Turned On");
    }
    fun turnOff() {
        isOn= false;
        println("Device Turned Off");
    }
}

// smart tv as a child of smart device. child IS-A type of parent
// there can be any number of children to a parent
// parent must be declared open to be inherited
class SmartTV(name: String): SmartDevice(name, "Smart TV") {
    var volume= 10;
    // set method is used to set to a specific value and must be declared next to field
    var channel= 1
        set(value) {
            if(value in 1..1000)
                field= value;
        }
    // delegates can also be used to set values, instead of setters
    // syntax: var x by delegate
    // those are nothing but some generic classes/fns we create to do so
    fun increaseVolume() {
        if(volume!=100) 
            volume++;
    }
    fun decreaseVolume() {
        if(volume!=0)
            volume--;
    }
    fun nextChannel() {
        channel++;
        channel%=1000;
    }
    fun previousChannel() {
        channel--;
        channel%=1000;
    }
    // functions can be overridden, only if they are declared open in super class
    override fun turnOn() {
        super.isOn= true;
        println("Device turned on, volume set to $volume and channel to $channel");
    }
}

abstract class AbstractClass() {
    // any class that has abstract methods is an abstract class
    abstract fun abstractMethod();
}

class NotAbstractClass(): AbstractClass() {
    // abstract class must be inherited and its abstract methods must be overriden
    override fun abstractMethod() {
        println("Hi");
    }
}


sealed class SealedClass() {
    // sealed classes can't be instantiated, but its sub classes can be
    // helps maintaining type-safety
    class A: SealedClass() {
        fun display() {
            println("A");
        }
    }
    class B: SealedClass() {
        fun display() {
            println("B")
        }
    }
}


// enums are used to create a type with limited 
// number of possible set of values, and using those
enum class Directions {
    // you can use it as string, but there is a possibitiy that
    // someone uses 'North', and the rest 'north', which makes it
    // complex to debug
    NORTH, SOUTH, EAST, WEST
    // to use, use Directions.NORTH
}

// singleton classes are simply declared as objects
// when declared in other classes, these can also be
// termed 'companion class', as it holds all the static
// data required in the class and can be accessed through
// any instance of the classs
object SingleTimeData {
    var x= 10;
    // can be accessed with object name, when declared independent
    // ClassName.ObjectName when in a class
}

fun SmartDevice.status() {
    if(this.isOn)
        println("This device is on");
    else
        println("This device is off");
}


fun main() {
    // instantiated using constructor
    val smartTVDevice= SmartTV("Andorid TV");
    // variables can be modified with/without setter
    smartTVDevice.channel= 1234;    // won't change, as voilates setrer
    smartTVDevice.volume= 25;
    // and can be accessed with/without getter too
    println("Channel: "+ smartTVDevice.channel+"\nVolume: "+smartTVDevice.volume);

    // sealed class, instantiation and access
    SealedClass.A().display()

    // data classes, used only to store data
    data class SomeData(var d: Int, var x: String);
    println(SomeData(3, "Data class").toString());

    // enumerators usage
    println(Directions.NORTH);

    // object/singleton usage
    println(SingleTimeData.x);
    
    // the extension function, accessed the same way as normal fn
    smartTVDevice.status();
}
