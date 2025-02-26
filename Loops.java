import java.util.Scanner;

// Create my class
public class Loops {
    public static void main(String[] args){

        // Loops (While and For)

        // While Loops work the same in C++ and Java
        String champion = "Eagles";
        Scanner input = new Scanner(System.in);

        // while (champion.equals("Eaegles")){ // can use champion.compareTo("Eagles") == 0);
        //     System.out.println("Woohoo! Eagles");
        //     System.out.println("Who is new champion: ");
        //     champion = input.next();
        // }

        // do{
        //     System.out.println("Woohoo! Chiefs");
        //     System.out.println("Who is new champion: ");
        //     champion = input.next();
        // }while (champion.equals("Chiefs"));

        // System.out.println("Cowboys are next!");
    
        // For Loop
        
        // for(counter_dec; condition; counter_inc)
        for(int i = 0; i < 5; i++){
            System.out.println("value of i is: " + i);
        }

        int x = 0;
        for (;;){
            if(x >=3)
                break;
            System.out.println("value of x is: " + x);

            x++;
        }
        input.close();
    }

}
