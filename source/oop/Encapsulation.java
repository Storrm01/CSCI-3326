package source.oop;

public class Encapsulation {
    // Attributes
    // I want to secure these Attributes
    // No medelin programmer can modify them, only me.
    // I need to make them all private
    private int importantX;
    private int importantY;
    private float importantZ;
    
    // methods
    // Getter and Setter for my Attributes
    // importantX can NEVER be below 0! Bad things will happen!
    public void set_importantX(int x){
        if (x >= 0){
            importantX = x;
        }
        else{
            System.out.println("YOU MANIAC");
        }
    }
    // importantY must ALWAYS be between 10 and 50. Bad things will happen!
    public void set_importantY(int y){
        if (y >= 10 && y <=50){
            importantY = y;
        }
        else{
            System.out.println("YOU FOOL!");
        }
    }
    // importantZ can NEVER be greater than -100.85. Bad things will happen!
    public void set_importantZ(float z){
        if (z < -100.85){
            importantZ = z;
        }
        else{
            System.out.println("WHAT IS WRONG WITH YOU!!");
        }
    }
    // Getter methods, should simply return their stored value.
    public int get_importantX(){
        return importantX;
    }
    public int get_importantY(){
        return importantY;
    }
    public float get_importantZ(){
        return importantZ;
    }
}
