package P10;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.printf("The greatest common divisor for %d and %d is %d", num1, num2, gcd(num1, num2));

        input.close();
    }
    
    public static int gcd(int num1, int num2){

        if (num2 == 0){
            return num1;
        }
        
        return gcd(num2, num1%num2);
    }
}
