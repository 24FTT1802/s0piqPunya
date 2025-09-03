import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int choice, randomChoice;
        String msg;
        String play = "y";
        int totalGame = 0;
        int win = 0;
        int loss = 0;

        while (play.equals("y")){

            do {
                System.out.print("Enter rock (0), paper (1), scissor (2): ");
                choice = input.nextInt();
                if (choice != 0 && choice != 1 && choice != 2){
                    System.out.println("Please enter 0-2 only");
                } 
            } while (choice != 0 && choice != 1 && choice != 2);
            
            randomChoice = (int)(Math.random() * Integer.MAX_VALUE % 3);

            switch (choice){
                case 0 -> {
                    switch (randomChoice){
                        case 0 : System.out.println("The computer is rock. You are rock. It is a draw.");
                                break;
                        case 1 : System.out.println("The computer is paper. You are rock. You Lose.");
                                loss++; break;
                        case 2 : System.out.println("The computer is scissor. You are rock. You Win.");
                                win++; break;
                    }
                }
                case 1 -> {
                    switch (randomChoice){
                        case 0 : System.out.println("The computer is rock. You are paper. You Win.");
                                win++; break;
                        case 1 : System.out.println("The computer is paper. You are paper. It is a draw.");
                                break;
                        case 2 : System.out.println("The computer is paper. You are paper. You Lose.");
                                loss++; break;
                    }
                }
                case 2 -> {
                    switch (randomChoice){
                        case 0 : System.out.println("The computer is rock. You are scissor. You Lose.");
                                loss++; break;
                        case 1 : System.out.println("The computer is paper. You are scissor. You Win.");
                                win++; break;
                        case 2 : System.out.println("The computer is scissor. You are scissor. It is a draw.");
                                break;
                    }
                }
            }

            totalGame++;
            System.out.print("\nEnter y to play again: ");
            play = input.next().toLowerCase();
        }

        msg = ((win - loss) > 0) ? "You win the game" 
            : ((win - loss) < 0) ? "You lose the game"
            : "It is a draw";

        System.out.printf("\nIn the total of %d round(s), You scored %d, computer scored %d\n", totalGame, win, loss);
        System.out.println(msg);        

        input.close();
    }
}
