import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double avg = 0;
        int positive = 0;
        int negative = 0;
        double total = 0;
        int choiceInt = 0;
        int cycle = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");

        do {
            choiceInt = input.nextInt();
            if (choiceInt > 0){
                positive++; cycle++;
            }
            else if (choiceInt < 0){
                negative++; cycle++;
            }

            total += choiceInt;

        } while (choiceInt != 0);

        System.out.println();

        avg = total / cycle;

        if (cycle == 0){
            System.out.println("No number is entered except for 0 to end the program");
        }
        else {
            System.out.println("The number of positive(s) is " + positive);
            System.out.println("The number of negative(s) is " + negative);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f", avg);
        }

        input.close(); 
    }
}
