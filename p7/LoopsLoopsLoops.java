package P7;

import java.util.Scanner;

public class LoopsLoopsLoops {
   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int i = 1;
    System.out.println("Below is generated using while loop:");
    while (i <= 20) {
        System.out.print(i + " ");
        i++;
    }

    int j = 50;
    System.out.println("\n\nBelow is generated using dowhile loop:");
    do {
        System.out.print(j + " ");
        j--;
    } while(j >= 35);

    System.out.println("\n\nBelow is generated using for loop:");
    for (int k = 97; k <= 122; k++){
        System.out.print((char)k + " ");
    }
    
    input.close();
   } 
}
