import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        /*1) Ask user for a word with strictly 5 letters. Not more Not less.
        2) Reverse the word
        3) Output the reverse word */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 5 letters word: ");
        String word = input.next();

        if(word.length() == 5){
            char char1 = word.charAt(0);
            char char2 = word.charAt(1);
            char char3 = word.charAt(2);
            char char4 = word.charAt(3);
            char char5 = word.charAt(4);

            System.out.printf("The reverse of the word %s is %c%c%c%c%c", word, char5, char4, char3, char2, char1);
        }

        input.close();
    }
}
