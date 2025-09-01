import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int choice;
        int month = 0;
        System.out.print("""
                Is your birth month in Set 1?
                1 3 5 7 9 11
                Enter 0 for No and 1 for Yes:""");
        choice = input.nextInt();
        if (choice == 1){
            month += 1;
        }

        System.out.print("""
                Is your birth month in Set 2?
                2 3 6 7 10 11
                Enter 0 for No and 1 for Yes:""");
        choice = input.nextInt();
        if (choice == 1){
            month += 2;
        }

        System.out.print("""
                Is your birth month in Set 3?
                4 5 6 7 12
                Enter 0 for No and 1 for Yes:""");
        choice = input.nextInt();
        if (choice == 1){
            month += 4;
        }

        System.out.print("""
                Is your birth month in Set 4?
                8 9 10 11 12
                Enter 0 for No and 1 for Yes:""");
        choice = input.nextInt();
        if (choice == 1){
            month += 8;
        }

        switch (month){
            case 1 -> System.out.println("You are born in January");
            case 2 -> System.out.println("You are born in Febuary");
            case 3 -> System.out.println("You are born in March");
            case 4 -> System.out.println("You are born in Apri");
            case 5 -> System.out.println("You are born in May");
            case 6 -> System.out.println("You are born in June");
            case 7 -> System.out.println("You are born in July");
            case 8 -> System.out.println("You are born in August");
            case 9 -> System.out.println("You are born in September");
            case 10 -> System.out.println("You are born in October");
            case 11 -> System.out.println("You are born in November");
            case 12 -> System.out.println("You are born in December");
            default -> System.out.println("Wrong input");
        }

        input.close();
    }
}
