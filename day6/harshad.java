import java.util.Scanner;
public class harshad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nums = num;
        int sum=0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println((nums%sum)==0?"Harshad Number":"Not Harshad Number");
        sc.close();
    }
}

