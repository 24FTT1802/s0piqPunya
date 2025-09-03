import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] tenNums = new int[10];
        int[] distNums = new int[10];
        int k = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++){
            tenNums[i] = input.nextInt();
        }

        for (int j = 0; j < 10; j++){
            boolean taken = false;
            for (int distNum : distNums){
                if (tenNums[j] == distNum){
                    taken = true;
                }
            }
            if (!taken){
                distNums[k] = tenNums[j];
                k++;
            }
        }
        
        Arrays.sort(distNums);
        
        System.out.print("The distinct numbers are: ");
        for (int i : distNums) {
            if (i != 0){
                System.out.print(i + " ");
            }
        }
        


        input.close();
    }
}
