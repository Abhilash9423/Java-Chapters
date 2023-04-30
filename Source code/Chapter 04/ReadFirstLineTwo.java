import java.util.*;
import java.io.*;

public class ReadFirstLineTwo {
   
    public static void main(String[] args) throws IOException
    {
        
        Scanner keyboard = new Scanner(System.in);
        String filename;

        filename = keyboard.nextLine();

        File file = new File(filename);

        Scanner inputFile = new Scanner(file);

        String line = inputFile.nextLine();
        System.out.println(line);
        inputFile.close();

    }

    
}
