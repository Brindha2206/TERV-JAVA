package day26;
import java.util.*;
public class currencyChange {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int[] denominations = new int[5];
    System.out.println("Denomination that shopkeeper has:");
    for(int i = 0;i<5;i++){
        denominations[i] = sc.nextInt();
    }
    Arrays.sort(denominations);
    System.out.println(Arrays.toString(denominations));
    System.out.println("Enter the amount you have:");
    int amount = sc.nextInt();
    System.out.println("The total bill:");
    int totalBill = sc.nextInt();
    int reqBalance = amount-totalBill;
    System.out.println("The change he need to return the customer are:");
    for(int i = denominations.length-1 ; i>=0;){
        if(reqBalance<denominations[i]){
            i--;
        }
        else{
            while (reqBalance>=denominations[i]) { 
                System.out.print(denominations[i]+" ");
                reqBalance = reqBalance-denominations[i];
            }
            if(reqBalance==0){
                break;
            }
        }
    }
    }
}
