import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // String date = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        // Importing time shouldn't be before input since the gap between import of time and after input can be significant

        String username = "Ahmad Ali";
        String pass = "12345";

        System.out.println("Please enter your username:");
        String typedUsername = input.nextLine();
        System.out.println("Please enter the password:");
        String typedPass = input.nextLine();
        System.out.println();

        String date = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        if (username.equals(typedUsername)){
            if (pass.equals(typedPass)){
                System.out.printf("Welcome %s. The time now is %s", username, date);
            }
            else {
                System.out.println("Error: Password doese not match.");
            }
        }
        else {
            System.out.println("Error: Invalid Username.");
        }

        input.close();
    }
}
