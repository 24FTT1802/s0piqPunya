import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression: ");
        int num1 = input.nextInt();
        char operator = input.next().charAt(0);
        int num2 = input.nextInt();

        switch (operator){
            case '+': System.out.println("The sum is " + (num1+num2)); break;
            case '-': System.out.println("The subtraction is " + (num1-num2)); break;
            case '*': System.out.println("The multiplication is " + (num1*num2)); break;
            case '/': if (num2 != 0){
                        System.out.println("The sum is " + (num1/num2));
                    }
                    else {
                        System.out.println("Math error: The divisor cannot be Zero");
                    } 
                    break;
        }
        
        input.close();
    }
}
