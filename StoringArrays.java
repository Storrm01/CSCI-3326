import java.util.Scanner;

public class StoringArrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an amount for inventory: ");
        int size = input.nextInt();
        int[] arr2 = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter each number: ");
            arr2[i] = input.nextInt();
        }
        System.out.println("The numbers you entered were: ");
        for(int element: arr2){
            System.out.println(element);
        }
        input.close();
    }    
}
