package P8;

import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numOfStudent = input.nextInt();

        int[] scores = new int[numOfStudent];

        int best = 0;
        System.out.println("\nEnter the 5 scores");
        for (int i = 0; i < numOfStudent; i++){
            scores[i] = input.nextInt();

            if (scores[i] > best){
                best = scores[i];
            }
        }

        char[] grade = new char[numOfStudent];
        for (int i = 0; i < numOfStudent; i++){
            int diff = best-scores[i]
            if (diff <= 10){
                grade[i] = 'A';
            }
            else if (diff <= 20){
                grade[i] = 'B';
            }
            else if (diff <= 30){
                grade[i] = 'C';
            }
            else if (diff <= 40){
                grade[i] = 'D';
            }
            else {
                grade[i] = 'F';
            }
        }

        System.out.println();
        for (int i = 0; i < numOfStudent; i++){
            System.out.printf("\nStudent %d score is %d and grade is %c", i+1, scores[i], grade[i]);
        }

        input.close();
    }
}
