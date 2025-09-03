package P7;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers, the input ends with 0 entered:");
        int choice = input.nextInt();
        int bignum = choice;
        int count = 1;
        while (choice !=0){
            choice = input.nextInt();

            if (choice != 0){
                if (choice > bignum){
                    bignum = choice;
                    count = 1;
                }
                else if (choice == bignum){
                    count++;
                }
            }
        }

        System.out.println("\nThe largest number is " + bignum);
        System.out.println("The occurence count of the largest number is " + count);

        input.close();
    }
}
