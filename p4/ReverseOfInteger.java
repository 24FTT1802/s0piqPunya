import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        // Write a program that reads an integer between 100 and 999, and finds the reverse of that integer. For example, if an integer is 123, its reverse is 321

        Scanner input = new Scanner(System.in);

        int numFull, num3, num2, num1, numBridge;

        System.out.print("Enter an integer between 100 and 999: ");
        numFull = input.nextInt();

        if(numFull >= 100 && numFull <= 999){
            num3 = numFull % 10;
            numBridge = numFull / 10;
            num2 = numBridge % 10;
            num1 = numBridge / 10;

            System.out.printf("The reverse of %d is %d%d%d", numFull, num3, num2, num1);
        }

        input.close();
    }
}
