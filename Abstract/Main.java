package Abstract;

// Abstraction.
// - Abstract methods & Abstract classes

// - Abstract methods can NOT be defined.
// - Abstract classes can NOT be instantiated.

// Abstraction requires Inheritance.

abstract class House { // Abstract class needs to have abstract in it as well
    abstract void about(); // about method is required
}

class Cabin extends House{
    @Override
    void about(){
        System.out.println("This is a Cabin.");
    }
}

public class Main {
    
}
