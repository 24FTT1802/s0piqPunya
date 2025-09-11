import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        /*1) Ask user for a word with strictly 5 letters. Not more Not less.
        2) Reverse the word
        3) Output the reverse word */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 5 letters word: ");
        String word = input.next();

        String reverseWord = "";    
        
        for (int i = word.length()-1; i >= 0; i--){
            reverseWord += word.charAt(i);
        }

        System.out.printf("The reverse of the word %s is %s", word, char5, char4, char3, char2, char1);
        
        input.close();
    }
}
