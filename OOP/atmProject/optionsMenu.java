package atmProject;
import java.io.IOException;
import  java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class optionsMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

    public void getLogin() throws IOException{
        int x = 1;
        do{
            try{
                data.put(952141,191904);
                data.put(989947,71976);

                System.out.println("Welcome to the atm project!");
                System.out.println("Enter your customer number...");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your PIN Number:");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e){
                System.out.println("\n" + "Invalid Character(s). Only Numbers." + "\n");
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn){
                geAccountType();
            } else
                System.out.println("\n" + "Wrong customer number or pin number" + "\n");
        }while (x == 1);
    }
    public void geAccountType(){
        System.out.println("Select the account you want to Access:");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type2 - Savings  Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                getChecking();
                break;
            case  2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM,Bye! \n");
                break;
            default:
                System.out.println("\n" + "Invalid choice." + "\n");
                geAccountType();
        }

    }
    public void getChecking(){
        System.out.println("Checking Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");

        System.out.println("choice");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking account Balance:" + moneyFormat.format(getChecking());
                geAccountType();
            case 2:
                getCheckingWithdrawInput();
                geAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                geAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM,Bye! \n");
                break;
            default:
                System.out.println("\n" + "Invalid choice." + "\n");
                getChecking();
        }
    }
}

