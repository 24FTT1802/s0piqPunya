import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestions {
    public static void main(String[] args) throws IOException {
        
        new File("C:\\Users\\ACER-1745\\Desktop\\Skewl/practical 5").mkdir();        
        FileWriter fw = new FileWriter("C:\\Users\\ACER-1745\\Desktop\\Skewl/practical 5/Modulus Questions.txt",true);
        
        int num1 = (int)(Math.random()*101);
        int num2 = (int)(Math.random()*101);
        fw.write(num1 + " % " + num2 + " = ?" + "\r\n");
        System.out.println("A new question added");

        fw.close();
    }
}
