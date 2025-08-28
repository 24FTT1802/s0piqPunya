import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {

        // 3rm = 1 bnd
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 to convert bnd to rm and 2 vise versa: ");
        int choice = input.nextInt();

        System.out.print("Enter the amount to be converted: $");
        double oriCurren = input.nextDouble();

        double newCurren = (choice == 1) ? oriCurren * 3 : oriCurren / 3;

        System.out.printf("The change is $%.2f", newCurren);

        input.close();
    }
}
