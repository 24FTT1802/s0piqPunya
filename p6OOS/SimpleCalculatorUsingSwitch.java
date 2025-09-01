import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        char operator;
        int num1;
        int num2;

        System.out.print("Enter an arithmetic expression: ");
        num1 = input.nextInt();
        operator = input.next().charAt(0);
        num2 = input.nextInt();

        switch (operator){
            case '+' -> System.out.println("The sum is " + (num1 + num2));
            case '-' -> System.out.println("The subtraction is " + (num1 - num2));
            case '*' -> System.out.println("The multiplication is " + (num1 * num2));
            case '/' -> {
                if (num2 != 0){
                    System.out.println("The division is " + (num1 / num2));
                }
                else {
                    System.out.println("Math error: The divisor cannot be Zero");
                }
            }
        }

        input.close();
    }
}
