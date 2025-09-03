package P7;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int fn1 = 1;
        int fn = 0;

        System.out.print("Please enter the term : ");
        int term = input.nextInt();

        for (int i = 0; i < term; i++){
            int fn2 = fn1 + fn;
            fn = fn1;
            fn1 = fn2;
        }

        System.out.printf("At term %d the number is %d", term, fn);

        input.close();
    }
}
