import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double costDurian = 15.75;
        double wallet;
        int unit;

        System.out.println("Each durian cost $" + costDurian);
        System.out.print("How much money do you have? $");
        wallet = input.nextDouble();

        unit = (int)(wallet / costDurian);

        System.out.println("The number of durian(s) you can buy is " + unit);

        input.close();
    }
}
