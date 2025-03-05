package Classes;
public class Classes {
    public static void main(String[] args){
        System.out.println("----------------------------------------");
        System.out.println();

        // Can use pet class from different file without importing due to being in the same folder
        Pet dog1 = new Pet("Spot", 6);
        dog1.name = "Bubbles";
        System.out.println(dog1);
        
        // Pet dog2;
        // dog2.name = "Patrick";

        // If I want to create an Example object, Example must be static.
    }
}