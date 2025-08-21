import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("How many nuumbers are there?");
        int numLength = input.nextInt();

        int[] numbers = new int[numLength];

        System.out.printf("Enter the %d numbers:\n", numLength);
        for (int i = 0; i < numLength; i++){
            numbers[i] = input.nextInt();
        }

        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();

        int[] temp = new int[shift];

        for (int j = 0; j < shift; j++){
            temp[j] = numbers[j];
        }

        for (int k = shift; k < numLength; k++){
            numbers[k - shift] = numbers[k];
        }

        int l = 0;
        for (int k = (numLength-shift); k < numLength; k++){
            numbers[k] = temp[l];
            l++;
        }

        System.out.println("The shifted arrangement is:");
        for (int number : numbers){
            System.out.print(number + " ");
        }

        input.close();
    }
}
