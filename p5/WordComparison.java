import java.util.Scanner;

public class WordComparison {
    public static void main(String[] args) {
        /*1) Ask user to enter two words
        2) Compare the two words case insensitive (ignore case)
        3) Output if the words are the same or not */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        System.out.println("Are both words the same? " + word1.equalsIgnoreCase(word2));


        input.close();
    }
}
