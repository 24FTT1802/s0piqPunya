import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numChoice;
        int occur = 0;
        int numBig = 0;

        System.out.println("Enter numbers, the input ends with 0 entered:");
        do {
            numChoice = input.nextInt();

            if (numChoice > numBig){
                numBig = numChoice;
                occur = 1;
            }
            else if (numChoice == numBig){
                occur++;
            }

        } while (numChoice != 0);

        System.out.println("\nThe largest number is " + numBig);
        System.out.println("The occurence count of the largest number is " + occur);

        input.close();
    }
}
