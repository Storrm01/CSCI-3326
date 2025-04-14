package Polymorphism;

// Super/Parent Class
class Car{
    int year;
    void about(){
        System.out.println("This is a Car.");
    }

}

// Sub/child class
class Van extends Car{
    String model;
    @Override
    void about(){
        System.out.println("This is a Van.");
    }
}

// Sub/Child class
class MiniVan extends Van{
    boolean electricDoors;
}

public class Main2 {
    public static void main(String[] args) {
        // Prior to inheritance
        // A Car variable can only point to an object of type Car
        Car regVar = new Car();
        // A Van variable can only point to an object of type Van
        Van regVar2 = new Van();

        // Thanks to inheritance I can create a Super/Parent type variable
        // And make it point to its own class or a Sub/Child oject.
        Car polyVar = new Van();
        polyVar.about(); // Calling from a Car variable.
        polyVar.year = 2000;
        // polyVar.model = "Camry"; // does not work
        // Let's fix, let's cast polyVar to a Van type
        ((Van)polyVar).model = "Camry";

        // Now I've implemented chain inheritance
        // Let's see if I can create a Car poly variable and cast it to Van and MiniVan
        Car polyMM = new MiniVan();
        polyMM.year = 2001;
        ((Van)polyMM).model = "Sienna";
        ((MiniVan)polyMM).electricDoors = true;
    }
}