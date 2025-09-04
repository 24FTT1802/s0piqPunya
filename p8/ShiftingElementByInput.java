package P8;

import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there?");
        int numLength = input.nextInt();
        int[] preShiftNum = new int[numLength];
        
        System.out.printf("Enter the %d numbers:\n", numLength);
        for (int i = 0; i < numLength; i++){
            preShiftNum[i] = input.nextInt();
        }

        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();
        shift %= numLength;

        int[] postShiftNum = new int[numLength];
        int count = 0;
        for (int j = 0; j < numLength; j++){
            if (j+shift < numLength){
                postShiftNum[j] = preShiftNum[j+shift];
            }
            else {
                postShiftNum[j] = preShiftNum[count];
                count++;
            }
        }

        System.out.println("\nThe shifted arrangement is:");
        for (int showNum : postShiftNum){
            System.out.print(showNum + " ");
        }

        input.close();
    }
}
