import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int armstrong = num;
        int temp= num;
        int digits = 0;
        int value = 0;
        while(num>0){
            digits++;
            num = num/10;
        }
        while(temp>0){
            int digit = temp%10;
            int power = 1;
            for(int i =0; i<digits;i++){
                power*= digit;
            }
            value += power;
            temp/=10;
        }
        System.out.println(value);
        System.out.println((value==armstrong)?"Yes":"No");
    }
}