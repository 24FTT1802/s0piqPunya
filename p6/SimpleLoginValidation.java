import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String username = "Ahmad Ali";
        String password = "12345";

        System.out.println("Please enter your username:");
        String tempUsername = input.nextLine();
        System.out.println("Please enter the password:");
        String tempPassword = input.nextLine();
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println();

        if (tempUsername.equals(username)){
            if (tempPassword.equals(password)){
                System.out.printf("Welcome %s. The time now is %s", username, time);
            }
            else {
                System.out.println("Error: Password does not match.");
            }
        }
        else {
            System.out.println("Error: Invalid username.");
        }

        input.close();
    }
}
