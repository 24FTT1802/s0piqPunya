package P8;

import java.util.Scanner;

public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
            System.out.print(alphabet[25-i] + " ");
        }

        input.close();
    }
}
