package P9;

import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner input = new Scanner(System.in);

        boolean game = true;

        System.out.println("""
                   |   |   
                -----------
                   |   |   
                -----------
                   |   |   """);

        char player = 'X';
        char comp = 'O';
        char[][] space2D = {{' ', ' ', ' '}, 
                            {' ', ' ', ' '}, 
                            {' ', ' ', ' '}};
        
        for (int apalah = 0; apalah < 5 && game == true; apalah++){

            boolean validMove = false;
            while (!validMove) {
                System.out.println("player's turn");
                System.out.print("Enter a row (0, 1 or 2): ");
                int choiceRow = input.nextInt();
                System.out.print("Enter column (0, 1 or 2): ");
                int choiceColumn = input.nextInt();
                if (space2D[choiceRow][choiceColumn] == ' '){
                    validMove = true;
                    space2D[choiceRow][choiceColumn] = player;
                }
                else {
                    System.out.println("Move choice is taken");
                }
            }
            System.out.println();
                
            if (
                // Horizontal
                (space2D[0][0] == player && space2D[0][1] == player && space2D[0][2] == player) || 
                (space2D[1][0] == player && space2D[1][1] == player && space2D[1][2] == player) || 
                (space2D[2][0] == player && space2D[2][1] == player && space2D[2][2] == player) ||
                // Vertical
                (space2D[0][0] == player && space2D[1][0] == player && space2D[2][0] == player) || 
                (space2D[0][1] == player && space2D[1][1] == player && space2D[2][1] == player) || 
                (space2D[0][2] == player && space2D[1][2] == player && space2D[2][2] == player) || 
                // Diagonal
                (space2D[0][0] == player && space2D[1][1] == player && space2D[2][2] == player) || 
                (space2D[0][2] == player && space2D[1][1] == player && space2D[2][0] == player) 
                ){
                    System.out.println("game ended, Player win");
                    game = false;
            }

            int compChoiceRow;
            int compChoiceColumn;

            boolean validChoice = false;
            while (apalah < 4 && validChoice == false && game) {
                    compChoiceRow = (int)(Math.random()*Integer.MAX_VALUE % 3);
                    compChoiceColumn = (int)(Math.random()*Integer.MAX_VALUE % 3);

                    if (space2D[compChoiceRow][compChoiceColumn] == ' '){
                        validChoice = true;
                        space2D[compChoiceRow][compChoiceColumn] = comp;
                    }
                }

            if (
                // Horizontal
                (space2D[0][0] == comp && space2D[0][1] == comp && space2D[0][2] == comp) || 
                (space2D[1][0] == comp && space2D[1][1] == comp && space2D[1][2] == comp) || 
                (space2D[2][0] == comp && space2D[2][1] == comp && space2D[2][2] == comp) ||
                // Vertical
                (space2D[0][0] == comp && space2D[1][0] == comp && space2D[2][0] == comp) || 
                (space2D[0][1] == comp && space2D[1][1] == comp && space2D[2][1] == comp) || 
                (space2D[0][2] == comp && space2D[1][2] == comp && space2D[2][2] == comp) || 
                // diagonal
                (space2D[0][0] == comp && space2D[1][1] == comp && space2D[2][2] == comp) || 
                (space2D[0][2] == comp && space2D[1][1] == comp && space2D[2][0] == comp) 
                ){
                    System.out.println("game ended, CPU win");
                    game = false;
            }

            System.out.printf("""
                 %c | %c | %c 
                -----------
                 %c | %c | %c 
                -----------
                 %c | %c | %c
                 """, 
                 space2D[0][0], space2D[0][1], space2D[0][2],
                 space2D[1][0], space2D[1][1], space2D[1][2],
                 space2D[2][0], space2D[2][1], space2D[2][2]);

        }

        input.close();
    }
}
