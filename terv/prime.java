import java.util.*;
import java.util.Scanner;
public class prime {
 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("No");
        } else {
            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    System.out.println("No");
                    return; 
                }
                i++;
            }
            System.out.println("Yes");
        }
    }
}
