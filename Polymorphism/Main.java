package Polymorphism;
public class Main extends Parent{
    // Overload
    // This is when a methods has the same identifier but different paramenters
    // The compiler can tell these two apart by their parameter amount and parameter type
    public void overload(double param1, int param2){    }

    public void overload(int param1, double param2){    }

    // When creating constructors we have been using Overload all along
    public Main(){  }

    public Main(int param1){    }
    public String nonOverride = "Main.";
    @Override
    public void override(){
        System.out.println("This function belongs to Main.");
        super.override();
    }
}
    class Parent{
        public String nonOverride = "Parent";
        public void override(){
            System.out.println("This function belongs to Parent.");
        }
    

    // Override
    // Override can only occur during Inheritance.
    // This occurs when we get two or more methods with the exact same name and parameter amount & type (aka same signature)

    public static void main(String[] args){
        Main obj = new Main();
        ((Parent)obj).override();
        System.out.println(((Parent)obj).nonOverride);
    }
}