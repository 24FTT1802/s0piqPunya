import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Full mark: ");
        int best = input.nextInt();             // fm1=90 fm2=68

        System.out.println("\nEnter the number of students");
        int length = input.nextInt();

        int[] scores = new int[length];
        String[] grades = new String[length];
        
        System.out.printf("\nEnter the %d scores\n", length);
        for (int i = 0; i < length; i++){
            scores[i] = input.nextInt();
        }

        System.out.println();

        for (int j = 0; j < length; j++){
            if (scores[j] >= (best-10)){
                grades[j] = "A";
            }
            else if (scores[j] >= (best-20)){
                grades[j] = "B";
            }
            else if (scores[j] >= (best-30)){
                grades[j] = "C";
            }
            else if (scores[j] >= (best-40)){
                grades[j] = "D";
            }
            else {
                grades[j] = "F";
            }

            System.out.printf("Student %d score is %d and grade is %s\n", (j+1), scores[j], grades[j]);
        }

        input.close();
    }
}
