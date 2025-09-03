import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int choice = input.nextInt();
        int ans = (int)(Math.random()*Integer.MAX_VALUE % 3);

        if (ans == 0){
            switch (choice) {
                case 0: System.out.println("The computer is rock. You are rock. It is a draw."); break;
                case 1: System.out.println("The computer is rock. You are paper. You Win."); break;
                case 2: System.out.println("The computer is rock. You are scissor. You Lose."); break;
            }
        }
        else if (ans == 1){
            switch (choice){
                case 0: System.out.println("The computer is scissor. You are rock. You Win."); break;
                case 1: System.out.println("The computer is scissor. You are paper. You Lose."); break;
                case 2: System.out.println("The computer is scissor. You are scissor. It is a draw."); break;
            }
        }
        else if (ans == 2){
            switch (choice){
                case 0: System.out.println("The computer is paper. You are rock. You Lose."); break;
                case 1: System.out.println("The computer is paper. You are paper. It is a draw."); break;
                case 2: System.out.println("The computer is paper. You are scissor. You Win."); break;
            }
        }

        input.close();
    }    
}
