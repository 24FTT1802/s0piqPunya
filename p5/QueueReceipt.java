import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String name = input.nextLine().toUpperCase();
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        int num = (int)(Math.random()*101);

        FileWriter fw = new FileWriter ("C:\\Users\\ACER-1745\\Desktop\\Skewl/practical 5/Queue Receipt.txt");

        fw.write(date + "\n\n");
        fw.write("Hi " + name + "\n\n");
        fw.write("Your queue number is: " + num);

        System.out.println("Receipt generated. Thank you.");        

        input.close(); fw.close();
    }
}
