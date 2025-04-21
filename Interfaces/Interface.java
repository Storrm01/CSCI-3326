package Interfaces;

// House is essentially now an interface
// abstract class House{
//     public static final int rooms;
//     public static final float bathrooms;
//     public abstract void about();
// }

interface House {
    int rooms = 4;
    float bathrooms = 2.5f;
    void about();
}

interface Home extends House{
    void info();
}

interface Shelter extends House {
    void stats();
}

class Lodge {
    public boolean is_haunted;
    public int rooms = 10;
}

class Cabin extends Lodge implements Home, Shelter{
    public boolean has_bears;
    @Override
    public void about(){
        System.out.println("This is a Cabin.");
    }
    @Override
    public void info(){
        System.out.println("Is located in the woods.");
    }
    @Override
    public void stats(){
        System.out.println("Is in good condition.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cabin obj = new Cabin();
        System.out.println("Rooms: " + ((House)obj).rooms);
    }
}
