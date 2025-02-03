// Decision Making
import java.util.Scanner;

public class Main {
    pubic static void main(String[] args){
        
        // Comparison Operators.
        // ==, !=, >, <, >=, <=
        // Work the same for numerical types
        System.out.println("7 > 2 : " + (7 > 2));
        System.out.println("7.2f > 2 : " + (7.2f > 2));
        System.out.println("A > B : " + ('A' > 'B'));
        System.out.println("A == 65 : " + ('A' == 65));

        // Deviating from C++
        // In Java we cannot compare booleans and numericals
        // System.out.printn("true == 1 : " + (true == 1));
        // System.out.println("2 > 3 > -1 : " + ('A' > 'B'));
        String word = "Hello";
        System.out.println("Is Hello greater than Bye : " + (word.comparetTo("Bye") > 0));

        // Comparing Characters with strings
        word = "Aardvark";
        System.out.println("First letter of word is : " + word.charAt(0));

        Scanner input = new Scanner( System.in );
        char letter = input.next().charAt(0);
        System.out.println("You input the letter " + letter);
        
    }
}
