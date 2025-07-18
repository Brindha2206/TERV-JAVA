import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cube = 0;
        while(num>0){
            int digit = num%10;
            cube+= (digit * digit * digit);
            num = num/10;
        }
        System.out.println(cube);
    }
}

