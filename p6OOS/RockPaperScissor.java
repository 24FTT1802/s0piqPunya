import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        
        // rock = 0; paper = 1; scissor = 2
        // paper beats rock (1 > 0)
        // rock beats scissor (0 > 2)
        // scissor beats paper (2 > 1)

        Scanner input = new Scanner(System.in);

        int choice;
        int ans = (int)(Math.random() * Integer.MAX_VALUE) % 3;

        do{
            System.out.println("Enter rock (0), paper (1), scissor (2)");
            choice = input.nextInt();
        } while (choice != 0 && choice != 1 && choice != 2);

        if (ans == 0){
            if (choice == 0){
                System.out.println("The computer is rock. You are rock. It is a draw.");
            }
            else if (choice == 1){
                System.out.println("The computer is rock. You are paper. You Win.");
            }
            else if (choice == 2){
                System.out.println("The computer is rock. You are scissor. You Lose.");
            }
        }
        if (ans == 1){
            if (choice == 0){
                System.out.println("The computer is paper. You are rock. You Lose.");
            }
            else if (choice == 1){
                System.out.println("The computer is paper. You are paper. It is a draw.");
            }
            else if (choice == 2){
                System.out.println("The computer is paper. You are scissor. You Win.");
            }
        }
        if (ans == 2){
            if (choice == 0){
                System.out.println("The computer is scissor. You are rock. You Win.");
            }
            else if (choice == 1){
                System.out.println("The computer is scissor. You are paper. You Lose.");
            }
            else if (choice == 2){
                System.out.println("The computer is scissor. You are scissor. You It is a draw.");
            }
        }

        input.close();
    }
}
