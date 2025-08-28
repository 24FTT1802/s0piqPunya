import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        
        // price-weight denisty

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the 1st package: $");
        double item1 = input.nextDouble();
        System.out.print("Enter the weight of the 1st package in gram: ");
        int weight1 = input.nextInt();

        System.out.println();
        
        System.out.print("Enter the price of the 2nd package: $");
        double item2 = input.nextDouble();
        System.out.print("Enter the weight of the 2nd package in gram: ");
        int weight2 = input.nextInt();

        double density1 = item1/weight1;
        double density2 = item2/weight2;
        
        String msg = (density1<density2) ? "1st" : "2nd";

        System.out.println("\nIt is worth to buy the " + msg + " package");

        input.close();
    }
}
