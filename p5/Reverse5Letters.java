import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 5 letters word: ");
        String word = input.next();

        char let1 = word.charAt(0);
        char let2 = word.charAt(1);
        char let3 = word.charAt(2);
        char let4 = word.charAt(3);
        char let5 = word.charAt(4);

        System.out.printf("The reverse of the word %s is %c%c%c%c%c", word, let5, let4, let3, let2, let1);

        input.close();
    }
}
