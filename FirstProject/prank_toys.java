import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class prank_toys {

    public void prank_random_toy(ArrayList toys) {
        Random rand = new Random();
        if (toys.size() <= 1) {
            System.out.println("In shop one toy, we cant do pranl(");
        } else {
            System.out.println("GO!");
            int col = rand.nextInt(toys.size());
            System.out.println(col);
            
            File file = new File("fileName.txt");
            try(FileOutputStream fos=new FileOutputStream(file);
            PrintStream printStream = new PrintStream(fos))
            {
                printStream.println(toys.get(col));
                System.out.println("Запись в файл произведена");
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }  
            toys.remove(col);
        }
    }
}