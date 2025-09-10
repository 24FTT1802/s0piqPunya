package P9;

import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // 4x6
        char[] student1 = {'A', 'B', 'C', 'D', 'A', 'B'};
        char[] student2 = {'C', 'D', 'D', 'A', 'B', 'D'};
        char[] student3 = {'D', 'D', 'A', 'B', 'B', 'A'};
        char[] student4 = {'C', 'A', 'D', 'A', 'B', 'C'};

        char[][] gradeLists = {student1, student2, student3, student4};
        char[] answers = new char[student1.length];
        int[] score = new int[gradeLists.length];
        String[] msgs = new String[gradeLists.length];

        System.out.println("Enter the key to the MCQ");
        for (int i = 0; i < student1.length; i++){
            answers[i] = input.next().charAt(0);
        }

        for (int i = 0; i < gradeLists.length; i++){
            for (int j = 0; j <= gradeLists.length; j++){
                if (gradeLists[i][j] == answers[j]){
                    score[i]++;
                }
            }
            msgs[i] = (score[i] > 2) ? "passed" : "failed";

            System.out.printf("Student %d's correct count is %d. Therefore, he/she %s the test.\n", i, score[i], msgs[i]);
        }

        input.close();
    }
}
