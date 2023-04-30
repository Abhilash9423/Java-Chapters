import java.util.*;

public class SwitchDemoTwo {
    public static void main(String[] args){
        int num ;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the number");
        num = keyboard.nextInt();
        
        switch(num)
        {
            case 1:
                System.out.println("you entered 1");
                break;
            case 2:
                System.out.println("you entered 2");
                break;
            default:
                System.out.println("someother number was selected");

        }

    }
}
