import java.util.Scanner;

public class RockPaperScissorTopOOS {
    public static void main(String[] args) {
        
        // rock = 0; paper = 1; scissor = 2
        // paper beats rock (1 > 0)
        // rock beats scissor (0 > 2)
        // scissor beats paper (2 > 1)

        Scanner input = new Scanner(System.in);

        int choice;
       
        do{
            System.out.println("Enter rock (0), paper (1), scissor (2)");
            choice = input.nextInt();
        } while (choice != 0 && choice != 1 && choice != 2);

        int ans = (int)(Math.random() * Integer.MAX_VALUE) % 3;
        
        String compChoice = (ans == 0) ? "rock" :
                            (ans == 1) ? "paper" :
                            "scissor";
        
        String playerChoice = (choice == 0) ? "rock" :
                              (choice == 1) ? "paper" :
                              "scissor";

        String msg = (choice == 0 && ans == 2) ||
                     (choice == 1 && ans == 0) ||
                     (choice == 2 && ans == 1) 
                     ? "You Win" :
                     (choice == 0 && ans == 1) ||
                     (choice == 1 && ans == 2) ||
                     (choice == 2 && ans == 0) 
                     ? "You Lose" :
                     "It is a draw";
        
        System.out.printf("The computer is %s. You are %s. %s.", compChoice, playerChoice, msg);

        input.close();
    }
}
