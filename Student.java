public class Student {
    public String name;
    public String email;
    public static int school_id;

    public Student(String paramName, String paramEmail){
        name = paramName;
        email = paramEmail;
    }
    public void studentInfo(){
        System.out.println(name + ", " + email + ", " + school_id);
    }
}
