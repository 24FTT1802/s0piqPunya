import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        new File("C:\\Users\\ACER-1745\\Desktop\\Skewl\\java\\itp-class-activity\\Practical 5").mkdir();

        FileWriter writer = new FileWriter("C:\\Users\\ACER-1745\\Desktop\\Skewl\\java\\itp-class-activity\\Practical 5/Modulus Questions.txt", true);
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        
        writer.write(num1 + " % " + num2 + " = ?" + "\r\n");

        System.out.println("A new question added");

        writer.close();
    }
}
