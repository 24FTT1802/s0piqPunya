package P8;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++){
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums);

        int count = 1;
        for (int i = 1; i < 10; i++){
            int temp = nums[i];
            if (temp != nums[count -1]){
                nums[count] = temp;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }

        input.close();
    }
}
