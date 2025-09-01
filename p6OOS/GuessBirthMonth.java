import java.util.Scanner;
import java.util.Set;

public class GuessBirthMonth {
    public static void main(String[] args){

        /*1) Ask the user a series sets of month.
        2) Capture the user’s answer.
        3) Find out the month the user is born and display the month in words.
        The sets are as below:
        Set 1 = 1, 3, 5, 7, 9, 11
        Set 2 = 2, 3, 6, 7, 10, 11
        Set 3 = 4, 5, 6, 7, 12
        Set 4 = 8, 9, 10, 11, 12
        */

        Scanner input = new Scanner(System.in);

        int choice;
        int month = 0;
        String monthBirth = "";
        boolean isValid = true;
        Set<Integer> validChoices = Set.of(0, 1);
        String[] qsns = {"""
                Is your birth month in Set 1?
                1 3 5 7 9 11
                Enter 0 for No and 1 for Yes:""",
            """
                Is your birth month in Set 2?
                2 3 6 7 10 11
                Enter 0 for No and 1 for Yes:""",
            """
                Is your birth month in Set 3?
                4 5 6 7 12
                Enter 0 for No and 1 for Yes:""",
            """
                Is your birth month in Set 4?
                8 9 10 11 12
                Enter 0 for No and 1 for Yes:"""};

        for (int i = 0; i < qsns.length; i++){
            do {
                System.out.print(qsns[i] + " ");
                choice = input.nextInt();
                if (!validChoices.contains(choice)){
                    System.out.println("just 0 or 1 bruh\n");
                }
            } while (!validChoices.contains(choice));
            System.out.println();

            month = (choice == 0) ? month : month + (int)Math.pow(2, i);
        }
        switch (month){
            case 1 -> monthBirth = ("January");
            case 2 -> monthBirth = ("Febuary");
            case 3 -> monthBirth = ("March");
            case 4 -> monthBirth = ("April");
            case 5 -> monthBirth = ("May");
            case 6 -> monthBirth = ("June");
            case 7 -> monthBirth = ("July");
            case 8 -> monthBirth = ("August");
            case 9 -> monthBirth = ("September");
            case 10 -> monthBirth = ("October");
            case 11 -> monthBirth = ("November");
            case 12 -> monthBirth = ("December");
            default -> {System.out.println("Please check your input");
                        isValid = false;}
        }
        
        if (isValid){
            System.out.println("You are born in " + monthBirth);
        }

        input.close();
    }
}
