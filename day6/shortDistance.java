import java.util.Scanner;
public class shortDistance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A<B){
            if(A<C){
                System.out.println("Car 1 goes into road A");
            }
            else{
                System.out.println("Car 1 goes into road C");
            }
        }
        else if (B<A){
            if(B<C){
                System.out.println("Car 1 goes into road B");
            }
            else{
                System.out.println("Car 1 goes into road C");
            }
        }
        else{
            System.out.println("No path exists");
        }
        sc.close();
    }
}
