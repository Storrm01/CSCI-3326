// Decision Making
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // Comparison Operators.
        // ==, !=, >, <, >=, <=
        // Work the same for numerical types
        System.out.println("7 > 2 : " + (7 > 2));
        System.out.println("7.2f > 2 : " + (7.2f > 2));
        System.out.println("A > B : " + ('A' > 'B'));
        System.out.println("A == 65 : ");

        // Deviating from C++
        // In Java we cannot compare booleans and numericals
        // System.out.printn("true == 1 : " + (true == 1));
        // System.out.println("2 > 3 > -1 : " + ('A' > 'B'));
        String word = "Hello";
        System.out.println("Is Hello greater than Bye : " + (word.compareTo("Bye") > 0));

        // Comparing Characters with strings
        word = "Aardvark";
        System.out.println("First letter of word is : " + word.charAt(0));

        Scanner input = new Scanner( System.in );
        char letter = input.next().charAt(0);
        System.out.println("You input the letter " + letter);

        // Decision Makin Statements.
        boolean x = false;
        if ( x == false ){
            System.out.println("Yes, false is equal to false.");
        }
    
        // Ternary operator is handy for assigning a value using  decision making
        // Uncool way to assign a value using decision making
        String coolVar;
        int num = 10;
        if(num > 25){
            coolVar = "Groovy";
        }
        else{
            coolVar = "Aces";
        }
        // The cool way of assigning a value using decision making
        coolVar = (num > 25) ? "Groovy" : "Aces";

        System.out.println("coolVar is " +coolVar);

        input.close();
    }

}
