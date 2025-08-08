import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {

        // Create a program that will randomly generate TWO whole numbers between 0 to 100 and ask the user for the sum follow by its modulus

        Scanner input = new Scanner(System.in);

        int limit = 100;
        int num1 = (int)(Math.random() * (limit + 1));
        int num2 = (int)(Math.random() * (limit + 1));

        int sum = num1 + num2;
        int modul = num1 % num2;

        System.out.printf("What is %d + %d ?\n", num1, num2);
        int ansSum = input.nextInt();
        System.out.printf("%d + %d = %d is %b\n\n", num1, num2, ansSum, sum==ansSum);

        System.out.printf("What is %d %% %d ?\n", num1, num2);
        int ansModul = input.nextInt();
        System.out.printf("%d %% %d = %d is %b", num1, num2, ansSum, modul==ansModul);

        input.close();
    }
}
