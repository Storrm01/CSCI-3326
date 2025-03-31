package Family.oop;

public class Child extends Parent{
    public String school;
    public String clubs;

    public Child(String s, String c , boolean m, String j){
        // Constructor from the Parent/Super class
        super(m,j); // can create constructor like this
        // Members from this/sub/Child class
        this.school = s;
        this.clubs = c;
        // Members from parent/super class
        super.morgage = m; // or like this
        super.job = j;
        // super.salary = s; // private attributes are passed but not accessible
        super.retirementplan = "401k";
        super.name = "Bob"; // from the Parent class
        ((Grandparent) this).name = "Robert";
        // a specific class
    }
}