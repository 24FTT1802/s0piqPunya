import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int numOri = input.nextInt();

        int num3 = numOri / 100;
        int num2 = (numOri / 10) % 10;
        int num1 = numOri % 10;
        
        System.out.printf("The reverse of %d is %d%d%d", numOri, num1, num2, num3);

        input.close();
    }
}
