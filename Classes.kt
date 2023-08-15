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

fun main() {
    // instantiated using constructor
    val smartTVDevice= SmartTV("Andorid TV");
    // variables can be modified with/without setter
    smartTVDevice.channel= 1234;    // won't change, as voilates setrer
    smartTVDevice.volume= 25;
    // and can be accessed with/without getter too
    println("Channel: "+ smartTVDevice.channel+"\nVolume: "+smartTVDevice.volume);
}
