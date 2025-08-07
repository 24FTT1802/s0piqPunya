import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double goalFund;
        int month;
        double saveDaily;

        System.out.print("What is your target amount? $");
        goalFund = input.nextDouble();
        System.out.print("How many month(s) to reach your goal? ");
        month = input.nextInt();

        saveDaily = goalFund / (month * 30);

        System.out.printf("The amount you need to save per day is $%.2f", saveDaily);

        input.close();
    }
}
