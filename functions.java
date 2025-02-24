// Functions


public class functions {
    public static void main(String[] args){
        

        // Create an object of Test / an instance of Test
        Test myTest = new Test();
        myTest.firstFunction();
        System.out.println("-----------");

        // I'm going to call sumOfTwo and I'm going to pass values 3 and 5
        double num = 3;
        sumOfTwo(num, 5);
        System.out.println("num after sumOfTwo: " + num);
    }

    // Parameters.
    // This function is going to accept 2 arguments
    static void sumOfTwo(double param1, double param2){
        System.out.println("param1: " + param1);
        System.out.println("param2: " + param2);
        System.out.println("Sum: " + (param1 + param2));
        param1++;
    }

}


class Test{
    void firstFunction(){
        System.out.println("First Function");
        secondFunction();
    }
    void secondFunction(){
        System.out.println("Second Function");
    }
}