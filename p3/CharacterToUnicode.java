import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char character;
        int unicode;

        System.out.print("Enter a character: ");
        character = input.next().charAt(0);

        unicode = (int)character;

        System.out.printf("The Unicode for character %c is %d", character, unicode);

        input.close();
    }
}
