import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] answers = {-1, -1, -1, -1};
        int[] guesses = new int[4];
        boolean win = false;
        
        for (int i = 0; i < 4; i++){
            boolean taken = false;
            int random = (int) (Math.random() * 10);
            for (int answer : answers){
                if (random == answer){
                    taken = true;
                }
            }
            if (!taken && answers[i] == -1){
                answers[i] = random;
            }
            else {
                i--;
            }
        }
        
        for (int i = 9; i >= 0 && !win; i--){
            
            System.out.println("Guess 4 numbers (no duplicates): ");
            for (int j = 0; j < 4; j++){
                guesses[j] = input.nextInt();
            }
            
            int right = 0;
            for (int k = 0; k < 4; k++){
                if (answers[k] == guesses[k]){
                    right++;
                }
            }
            if (right == 4){
                System.out.println("You Won! You got the actual number!");
                win = true;
            }
            else {
                if (i == 0){
                    System.out.printf("The actual number is %d %d %d %d. You Lose.", answers[0], answers[1], answers[2], answers[3]);
                }
                else {
                    System.out.printf("You have scored %d out of the 4 numbers. You have %d chances left.\n", right, i);
                }
            }
        }
        
        input.close();
    }
}
