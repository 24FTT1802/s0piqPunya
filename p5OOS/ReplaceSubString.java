import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        /*1) Ask user for message. (1 sentence)
        2) Ask user on what substring they would like to replace.
        3) Ask user on what they want the substring to be replaced to.
        4) Output updated message to user */

        Scanner input = new Scanner(System.in);

        String msg, replaceMsg, newMsg;
        
        System.out.println("Enter your message:");
        msg = input.nextLine();

        System.out.print("\nEnter the substring to replace: ");
        replaceMsg = input.nextLine();

        if(msg.contains(replaceMsg)){
            System.out.print("\nEnter the replacement string: ");
            newMsg = input.nextLine();

            System.out.printf("\nThe updated message is:\n%s", msg.replace(replaceMsg, newMsg));
        }
        else{
            System.out.println("\ncant even do a simple task");
        }

        input.close();
    }
}
