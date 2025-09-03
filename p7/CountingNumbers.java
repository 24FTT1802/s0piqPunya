package P7;

import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int total = 0;
        int choice = 0;
        int count = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        do {
            choice = input.nextInt();
            
            if (choice < 0){
                neg++; count++;
            }
            else if (choice > 0){
                pos++; count++;
            }

            total += choice;

        } while (choice != 0);
        System.out.println();

        if (count != 0){
            System.out.println("The number of positive is " + pos);
            System.out.println("The number of negative is " + neg);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f", ((double)total)/count);
        }
        else {
            System.out.println("No number is entered except for 0 to end the program.");
        }

        input.close();
    }
}
