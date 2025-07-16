import java.util.Scanner;
public class boat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int boat = sc.nextInt();
        int adults = sc.nextInt();
        int children = sc.nextInt();
        int weight = (adults*75)+(children*30);
        System.out.println((weight)<=boat?"Boat is Stable":Boat is not Stable);
    }
}
