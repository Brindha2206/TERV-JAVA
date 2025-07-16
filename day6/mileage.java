  import java.util.Scanner;
public class mileage {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float mileage = sc.nextFloat();
        int petrol = sc.nextInt();
        int distance = sc.nextInt();
        if((mileage*petrol)==distance){
            System.out.println("Can reach");
        } 
        else{
            System.out.println("Cannot reach");
        }
        sc.close();
    }
}

