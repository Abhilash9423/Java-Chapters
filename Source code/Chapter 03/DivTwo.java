import java.util.*;
import javax.swing.JOptionPane;

public class DivTwo {
    public static void main(String[] args){
        String inputString;
        int number1;
        int number2;
        int quotient;
        boolean flag=true;
        int check;


        while(flag)
        {
            inputString = JOptionPane.showInputDialog("enter the number 1");
            number1 = Integer.parseInt(inputString);
            inputString=JOptionPane.showInputDialog("enter the second nunber");
            number2 =Integer.parseInt(inputString);
            if (number2 == 0)
            {
             
                JOptionPane.showMessageDialog(null, "Division by zero is not possible.");
                // inputString = JOptionPane.showInputDialog("do you want to continue");
                check = JOptionPane.showConfirmDialog(null, "do you want to continue",inputString, JOptionPane.YES_NO_OPTION);
                System.out.println(check);
                flag = check==0? true:false;
                // flag = Boolean.parseBoolean(inputString.toLowerCase());

            }
            else
            {
                quotient = number1 / number2;
                JOptionPane.showMessageDialog(null, "the quotient is" + quotient);
                // inputString = JOptionPane.showInputDialog("do you want to continue");
                check = JOptionPane.showConfirmDialog(null, "do you want to continue",inputString, JOptionPane.YES_NO_OPTION);
                flag = check==0? true:false;
                // flag = Boolean.parseBoolean(inputString.toLowerCase());
               
            }
     
    }
}
}
