/**
   This program demonstrates the ++ and -- operators
   in prefix mode.
*/

public class Prefix
{
   public static void main(String[] args)
   {
      int number = 4;  // number starts out with 4
      int number_two =7;
      // Display the value in number.
      System.out.println("number is " + number);
      System.out.println("I will increment number.");
      
      // Increment number.
      ++number;
      number_two++;

      // Display the value in numbe again.
      System.out.println("Now, number is " + number);
      System.out.println("I will decrement number.");
      System.out.println(number_two);
      number_two++;
      System.out.println("2   "  + number_two);

      // Decrement number.
      --number;
      
      // Display the value in number once again.
      System.out.println("Now, number is " + number);
   }
}
