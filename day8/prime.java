import java.util.Scanner;
public class prime {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(((num%2)==0)&&(num!=2)?"Yes":"No");
    }
}

