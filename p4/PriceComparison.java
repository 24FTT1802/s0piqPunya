import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        /*Occasionally during grocery shopping you may find similar item however in different packaging and in different price.
        For example, a powdered chocolate drink may cost 11.90 for 2000g (2kg) while 5.50 for 850g. It might be hard to decide which is actually worth to buy where by instinct, we will
        just buy the bigger one as we assume that it should be cheaper when buying in bulk (Most
        of time but not all). Thus this becomes a strategy for seller to earn extra using packaging
        strategy.
        Write a program that will:
        1) Ask user how much the 1st package cost and its weight
        2) Ask user how much the 2nd package cost and its weight
        3) Tell the user which one is much worthy to buy 
        */

        Scanner input = new Scanner(System.in);

        double price1, price2, weight1, weight2, density1, density2;

        System.out.print("Enter the price of the 1st package: $");
        price1 = input.nextDouble();
        System.out.print("Enter the weight of the 1st package in gram: ");
        weight1 = input.nextDouble();

        System.out.print("\nEnter the price of the 2nd package: $");
        price2 = input.nextDouble();
        System.out.print("Enter the weight of the 2nd package in gram: ");
        weight2 = input.nextDouble();

        density1 = weight1 / price1;
        density2 = weight2 / price2;

        String msg = (density1 > density2) ? "It is worth more to buy the 1st package" :
                     (density1 < density2) ? "It is worth more to buy the 2nd package" :
                     "sama je";

        System.out.println("\n" + msg);

        input.close();
    }
}
