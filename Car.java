public class Car {
    public String model;
    public String make;
    public int year;

    public Car(String paramModel, String paramMake, int paramYear){
        model = paramModel;
        make = paramMake;
        year = paramYear;
    }

    public boolean is_new(){
        return year >= 2025;
    }
}
