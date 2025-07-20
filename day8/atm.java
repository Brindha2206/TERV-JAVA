import java.util.Scanner;
public class atm {
    public static void lines(){
        System.out.println("==========================================");
    }
    public static void switches(int accontBalance, int pin_org, int accountNumber, int otp,int x){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    {   
                        lines();
                        System.out.println("Enter the amount to be credited:");
                        int amountToCredit = sc.nextInt();
                        accontBalance = accontBalance + amountToCredit;
                        System.out.printf("Total balance: %.2f " , accontBalance);
                    }
                    break;
            
                case 2:
                    {   
                        lines();
                        System.out.println("Enter the amount to be debited");
                        int amountToDebit = sc.nextInt();
                        if (amountToDebit<accontBalance) {  
                            accontBalance = accontBalance - amountToDebit;
                            System.out.printf("Total balance: %.2f " , accontBalance );
                        }
                        else{
                            System.out.println("Insufficient balance");
                            lines();
                        }
                    }
                    break;

                case 3:
                {   
                    lines();
                    System.out.println("The total balance is:"+accontBalance);
                    lines();
                    break;
                }
              

                case 4:
                {
                    lines();
                    System.out.println("Enter your current pin:");
                    int current_pin = sc.nextInt();
                    // System.out.println((current_pin==pin_org)?"Enter new pin:":"invalid pin");
                    if (current_pin == pin_org) {
                        System.out.println("Enter yout new pin: ");
                        int new_pin = sc.nextInt();
                        pin_org = new_pin;
                        System.out.println("New pin updated: " + pin_org);
                        lines();
                    }
                    else{
                        System.out.println("Invalid pin. \n TRY AGAIN!!");
                        lines();
                        break;
                    }
                }
                break;
                case 5:
                {
                    System.out.println("Enter your account number:");
                    long accNum = sc.nextLong();
                    if (accNum==accountNumber) {
                        System.out.println("An otp has been shared to your registered mobile number");
                    }
                    else{
                        System.out.println("Invalid Account number");
                        break;
                    }
                    System.out.println("Enter OTP:");
                    int enter_otp = sc.nextInt();
                    if (enter_otp == otp) {
                        System.out.println("Transaction started");

                    }
                    break;
                }
                case 0:
                {
                    x=0;
                    break;
                }
                default:
                    break;
            }
            return;
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE INDIAN BANK ATM!!");
        lines();
        
        // int pin = 1234;//scanner
        Scanner sc = new Scanner(System.in);
        int pin_org= 1234;
        String name = "BRINDHA";
        int accountNumber = 1234567890;
        int accontBalance = 30000;
        int otp = 4321;
        for(int attempt = 3; attempt>0;)
        {   
            System.out.println("Enter your pin:");
            int pin = sc.nextInt();
        if (pin==pin_org) {
            System.out.println("Welcome " + name);
            lines();
            for (int x = 1; x ==1;) {
            System.out.println("1.Credit amount \n2.Debit amount \n3.Check Balance \n4.Change the pin \n5.Cardless Transaction\n 0.Exit");
            lines();
            System.out.print("Enter your choice:");
                switches(accontBalance,accountNumber,pin_org,otp,x);
        }
            break;
        
        
    }
        else{
            --attempt;
            System.out.println("Invalid pin");
            System.out.println("Enter the correct PIN: " + attempt+ ((attempt>1) ?" attempts left":" attempt left"));
        }
        }
    
    }
}
