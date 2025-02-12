import java.util.Arrays;

// Name of class
public class arrays {
    // Set up work area
    public static void main(String[] args){
        
        // Working with arrays in Java.
        // Arrays in Java are declared dynamically
        
        // Let's make an int array of size 5
        int [] arr = new int[5];

        // Let's verify arr is  of size 5
        // length is an atribute/variable
        System.out.println("Size of arr is: " + arr.length); // no need for '()' after length because it's and attribute

        // Everything else follows the same procedure/syntax as C++
        // String wordArr[5]; <- this does not work as it needs to be dynamically declared
        float floatArr [] = {33.5f, 2.5f, 3.0f, 5.2f, 10.3f};
        System.out.println("Size of floatArr is: " + floatArr.length);
        System.out.println("The third item in floatArr is: " + floatArr[2]);
        for (int i = 0; i < floatArr.length; i++){
            float current = floatArr[i]; 
            System.out.println("index: " + i + " value: " + current);
        }
        Arrays.sort(floatArr);
        // for each loop
        int i = 0;
        for(float current : floatArr){
            System.out.println("index: " + i + " value: " + current);
            i++;
        }
        // String wordArr[5]; <-- won't work in Java
        String wordsarr[] = {"good", "morning", "to", "you"};
    }
}