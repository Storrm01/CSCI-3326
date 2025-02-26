public class pass {
    public static void main(String[] args){
        // Declare my variables
        int num = 3;
        int num2 = 7;
        int [] arr = {1, 2, 3};
        Dog obj = new Dog();
        // Pass-by
        coolFunction(num, num2);
        System.out.println("num: " + num + ", num2: " + num2);
        // Pass-by-reference
        refFunction(arr);
        System.out.println("arr[0]: " + arr[0]);

        objFunction(obj);
        System.out.println("obj.age: " + obj.age + ", obj.legs: " + obj.legs);
    }   
    static void objFunction(Dog p_obj){
        p_obj.age = 7;
        p_obj.legs = 3;
    }

    static void refFunction(int[] p_arr){
        p_arr[0]++;
    }

    static void coolFunction(int param1, int param2){
        param1++;
        param2++;
    } 
}

class Dog {
    int age = 7;
    int legs = 4;
}