import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

public class FileWriteDemo3 {
    
    public static void main(String[] args) throws IOException
    {
        String filename;
        String friendname;
        int numofFriends;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("enter the file name");
        filename = keyboard.nextLine();

        System.out.println("enter the number of firends");
        numofFriends= keyboard.nextInt();


        PrintWriter outputfile = new PrintWriter(filename);

        for(int i=0;i<numofFriends;i++){
            System.out.println("Enter your friends name");
            friendname = keyboard.nextLine();
            outputfile.println(friendname);

        }
        outputfile.close();
        System.out.println("data written to the file");
    }


}
