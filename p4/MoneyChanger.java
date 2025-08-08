import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        /*Assume the ratio of Brunei currency to Malaysia currency is 1:3 meaning 1bnd will be converted to 3rm and 3rm will convert to 1bnd.
        Write a program that will:
        1) Ask user what currency they want to change to.
        2) Ask user the amount they want to change
        3) Display the change in two decimal point
        */

        Scanner input = new Scanner(System.in);

        int choice;
        double oldChange;
        double newChange;
        
        System.out.print("Enter 1 to convert bnd to rm and 2 vise versa: ");
        choice = input.nextInt();
        System.out.print("Enter amount to be converted: $");
        oldChange = input.nextDouble();
        
        newChange = (choice == 1) ? oldChange * 3 :
                    (choice == 2) ? oldChange / 3 :
                    0;
        
        System.out.printf("The change is $%.2f", newChange);

        input.close();
    }
}
