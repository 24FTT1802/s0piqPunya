package P7;

import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int count = 0;
        int win = 0;
        int lose = 0;
        boolean play = true;

        while (play){
            System.out.println("Enter rock (0), paper (1), scissor (2)");
            int choice = input.nextInt();
            int ans = (int)(Math.random()*Integer.MAX_VALUE % 3);

            if (ans == 0){
                switch (choice) {
                    case 0: System.out.println("The computer is rock. You are rock. It is a draw."); break;
                    case 1: System.out.println("The computer is rock. You are paper. You Win.");
                            win++; break;
                    case 2: System.out.println("The computer is rock. You are scissor. You Lose.");
                            lose++; break;
                }
            }
            else if (ans == 1){
                switch (choice){
                    case 0: System.out.println("The computer is scissor. You are rock. You Win.");
                            win++; break;
                    case 1: System.out.println("The computer is scissor. You are paper. You lose.");
                            lose++; break;
                    case 2: System.out.println("The computer is scissor. You are scissor. It is a draw."); break;
                }
            }
            else if (ans == 2){
                switch (choice){
                    case 0: System.out.println("The computer is paper. You are rock. You Lose.");
                            lose++; break;
                    case 1: System.out.println("The computer is paper. You are paper. It is a draw."); break;
                    case 2: System.out.println("The computer is paper. You are scissor. You win.");
                            win++; break;
                }
            }
            System.out.println();

            count++;
            System.out.print("Enter y to play again: ");
            String temp = input.next();
            if (!temp.equalsIgnoreCase("y")){
                play = false;
            }
            System.out.println();
        }

        String msg = (win > lose) ? "You won the game." :
                     (win < lose) ? "You lost the game.":
                     "It is a draw game.";

        System.out.printf("In the total of %d round(s), You scored %d, Computer scored %d. %s", count, win, lose, msg);

        input.close();
    }
}
