package Abstract;

/* Abstraction
 *  Abstract classes - can't be instantiated. We can't make objects.
 *  Abstract methods - can't be defined within their class
 */

abstract class House{
    public int rooms;
    public int windows;
    public int doors;

    abstract public void about();
}



class Cabin extends House{
    public boolean has_bears;
    public boolean has_fireplace;

    @Override
    public void about(){
        System.out.println("This is a Cabin.");
    }
}

class Mansion extends House{
    public boolean has_theatre;
    public boolean has_gym;

    @Override
    public void about(){
        System.out.println("This is a Mansion.");
    }
}

public class main2 {
    public static void main(String[] args) {
        // House is an abstract class
        // I'm going to try to mae a House object.
        // House myHouse = new House(); <- this will error

        // I can create objects from Cabin and Mansion
        Cabin myCabin = new Cabin();
        myCabin.rooms = 3;
        Mansion myMansion = new Mansion();
        myMansion.rooms = 65;
        myMansion.about();

        // Let's make a polymorphic variable
        // This is possble because the instance is Cabin/
        // The variable type is House
        House myHouse = new Cabin();
        myHouse.rooms = 5;
    }
}
