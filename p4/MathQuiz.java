import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int maxNum = 100;

        int num1 = (int)(Math.random() * (maxNum+1));
        int num2 = (int)(Math.random() * (maxNum+1));

        System.out.printf("What is %d + %d ?\n", num1, num2);
        int ansSum = input.nextInt();
        System.out.printf("%d + %d = %d ? %b\n", num1, num2, ansSum, (num1+num2)==ansSum);

        
        System.out.printf("\nWhat is %d %% %d ?\n", num1, num2);
        int ansModul = input.nextInt();
        System.out.printf("%d %% %d = %d ? %b\n", num1, num2, ansModul, (num1%num2)==ansModul);

        input.close();
    }
}
