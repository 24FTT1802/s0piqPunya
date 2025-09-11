import java.util.Scanner;

public class FibonacciNumbersRecursive {
    
    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the term: ");
        int n = input.nextInt();        

        System.out.printf("At term %d the number is %d", n, fibonacci(n));

        input.close();
    }
}
