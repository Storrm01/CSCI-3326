package Family.oop;

public class Parent extends Grandparent{
    public boolean morgage;
    public String job;
    private float salary; // Private
    public String name;
    protected String car;


    public Parent(boolean m, String j){
        morgage = m;
        job = j;
    }

    public Parent(){

    }
}
