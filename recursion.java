public class recursion {
    public static void main(String[] args){
        // test my recursive function
        System.out.println("----------------------------------------");

        countdown(5);
        // Test my factorial
        System.out.println("3!: " + factorial(3));
    }

    // Now I want to create a recursive function, to get the
    // Factorial of a number
    // n! = n * (n-1) *(n - 2) * ... * 1
    static int factorial(int n){
        // Base case:
        if(n == 1){
            return 1;
        }
        else if(n <= 0){
            System.out.println("Let's not.");
            return 0;
        }
        else{
            // Recursive call
            
            return n * factorial(n-1);
        }
    }

    // Create a simple recursive function.
    // A countdown recursive function.
    // countdown from n to 1, then print, "Take Off!"
    static void countdown(int n){
        // Base case: 
        if(n == 0){
            System.out.println("Take Off!");
        }
        else if(n < 0){
            System.out.println("Wrong number!");
        }
        else{
            System.out.println(n);
            // recursive call.
            countdown(n-1);
        }
    }
}
