package P8;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] decimals = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < decimals.length; i++){
            int index = (int)(Math.random()*Integer.MAX_VALUE % 10);

            int temp = decimals[i];
            decimals[i] = decimals[index];
            decimals[index] = temp;
        }

        int[] guessNum = new int[4];

        // for (int dog = 0; dog < 4; dog++){
        //     System.out.print(decimals[dog]);
        // }

        for (int chance = 9; chance >= 0; chance--){
            int score = 0;
            System.out.println("\n\nGuess 4 numbers (no duplicates):");
            for (int j = 0; j < 4; j++){
                guessNum[j] = input.nextInt();
            }

            for (int k = 0; k < 4; k++){
                if (guessNum[k] == decimals[k]){
                    score++;
                }
            }

            if (score == 4){
                System.out.println("You Won! You got the actual number!");
                break;
            }
            else {
                if (chance != 0){
                    System.out.printf("You have score %d out of the 4 numbers. You have %d chances left.", score, chance);
                }
                else {
                    System.out.println("You Won! You got the actual number!");
                }
            }
        }

        input.close();
    }
}
