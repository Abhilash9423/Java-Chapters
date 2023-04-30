import java.util.*;
public class ObjArray {
    
    public static void main(String[] args){
        final int ACCOUNT_No = 2;
        BankAccount[] accounts = new BankAccount[ACCOUNT_No];
        
        createAccounts(accounts);
        for(int i=0;i<accounts.length;i++){
            System.out.println(accounts[i].getBalance());
        }

        }

    private static void createAccounts(BankAccount[] array){
        double balance;
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            balance = keyboard.nextDouble();
            array[i] = new BankAccount(balance);
        }
        
    }
}