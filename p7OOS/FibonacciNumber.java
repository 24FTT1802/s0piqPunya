import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int fn0 = 0;
        int fn1 = 1;
        int fn2;
        int term;

        System.out.print("Please enter the term: ");
        term = input.nextInt();

        for (int i = 0; i < term; i++){    
            fn2 = fn0 + fn1;
            fn0 = fn1;
            fn1 = fn2;
        }

        System.out.printf("At term %d the number is %d", term, fn0);
            
        input.close();
    }
}
