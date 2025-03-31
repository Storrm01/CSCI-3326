package Family;
import Family.oop.*;

public class App extends Parent {
    
    public void test(){
        super.morgage = true;
        super.job = "coal mine";
        super.car = "Ford";
        System.out.println(morgage + car + job);
    }
    public static void main(String[] args) throws Exception{
        // Protected attribute belongs to parent.
        App obj = new App();
        obj.test();
        obj.job = "Mall";
        obj.morgage = false;
        // Since App inherited Parent, it can access car from its instances.
        obj.car = "Toyota";
        // We can't access a protected attribute from that instance.
        // Parent p = new Parent();
        // p.car = "Toyota"; // <- this would not work
    }
}
