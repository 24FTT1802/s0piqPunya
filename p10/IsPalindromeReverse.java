package P10;

import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num = (int)(Math.random()*900 + 100);
      
        System.out.printf("Enter the reverse of %d: ", num);
        int rev = input.nextInt();

        System.out.printf("\nThe digit %d is palindrome of %d is %b", rev, num, isPalindrome(rev, num));

        input.close();
    }

    public static boolean isPalindrome(int rev, int num){
        
        int real = 0;
        while (num > 0){
            real += num%10;
            num /= 10;
            if (num > 0){
                real *= 10;
            }
        }

        if (rev == real){
            return true;
        }
        else {
            return false;
        }
    }
}
