import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your message:");
        String msg = input.nextLine();

        System.out.print("\nEnter the substring to replace: ");
        String replace = input.nextLine();
        System.out.print("\nEnter the replacement string: ");
        String replacement = input.nextLine();

        System.out.println("\nThe updated message is:");
        System.out.println(msg.replace(replace, replacement));

        input.close();
    }
}
