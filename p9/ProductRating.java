package P9;

import java.util.Scanner;

public class ProductRating {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] cust1 = {4, 5, 4};
        int[] cust2 = {3, 5, 3};
        int[] cust3 = {4, 5, 3};
        int[] cust4 = {1, 2, 1};

        int[][] customerRatingLists = {cust1, cust2, cust3, cust4};

        double[] avgs = new double[customerRatingLists.length];
        double[] avgsWut = new double[cust1.length];

        for (int i = 0; i < customerRatingLists.length; i++){
            for (int j = 0; j < cust1.length; j++){
                avgsWut[j] += customerRatingLists[i][j];
                avgs[i] += customerRatingLists[i][j];
            }
            avgs[i] /= cust1.length;
        }

        for (int i = 0; i < cust1.length; i++){
            avgsWut[i] /= customerRatingLists.length;
        }
        
        System.out.println("Rating    Product   Package   Delivery");
        System.out.printf("Average     %.2f      %.2f      %.2f\n", avgsWut[0], avgsWut[1], avgsWut[2]);
        for (int i = 0; i < customerRatingLists.length; i++){
            System.out.printf("\nCustomer %d provide the average rating %.2f", i+1, avgs[i]);
        }

        input.close();
    }
}
