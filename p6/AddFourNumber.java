import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);
        int num3 = (int)(Math.random()*100);
        int num4 = (int)(Math.random()*100);
        int ans = num1 + num2 + num3 + num4;

        System.out.printf("What is %d + %d +%d +%d? ", num1, num2, num3, num4);
        int typedAns = input.nextInt();

        if (ans == typedAns){
            System.out.println("Well done, you are correct!");
        }
        else {
            System.out.println("Nice try, the sum should be " + ans);
        }

        input.close();
    }
}
