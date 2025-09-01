import java.io.FileWriter;
import java.io.IOException;
// import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// import java.util.Date;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter("C:\\Users\\ACER-1745\\Desktop\\Skewl\\java\\itp-class-activity\\Practical 5/QReceipt.txt");

        // SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        // String date = sdf.format(new Date());
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));
        int num = (int)(Math.random() * 100);

        writer.write(date + "\n\n Hi, " + name + "\n\n Your queue No is : " + num);

        System.out.println("Receipt generated. Thank you");

        input.close(); writer.close();
    }
}
