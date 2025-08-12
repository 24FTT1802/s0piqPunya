import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        
        /*1) Generate four random numbers between 0 to 99.
        2) Ask the user the sum of all four numbers.
        3) It is a must to use If and else to display if the answer by the user is correct or not. */

        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        int num3 = (int)(Math.random() * 100);
        int num4 = (int)(Math.random() * 100);

        int ans = num1 + num2 + num3 + num4;

        System.out.printf(" What is %d + %d + %d + %d?\n", num1, num2, num3, num4);
        int ansGiven = input.nextInt();

        if (ans == ansGiven){
            System.out.println("Well done, you are correct!");
        }
        else {
            System.out.println("Nice try, the sum should be " + ans);
        }

        input.close();
    }
}
