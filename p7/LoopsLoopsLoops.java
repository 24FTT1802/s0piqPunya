import java.util.Scanner;

public class LoopsLoopsLoops {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int num1 = 1;
        int num2 = 50;

        System.out.println("Below is generate using while loop:");
        while (num1 <= 20){
            System.out.print(num1 + " ");
            num1++;
        }

        System.out.println("\n\nBelow is generate using dowhile loop:");
        do{
            System.out.print(num1 + " ");
            num2--;
        } while (num2 >= 35);

        System.out.println("\n\nBelow is generate using for loop:");
        for (int i = 0; i < 26; i++){
            System.out.print((char)(97+i) + " ");
        }

        input.close();
    }
}
