package day3;
public class train {
    public static void main(String[] args) {
        int n = 50;
        int rem = n%8;
        if (rem == 1 || rem == 4) {
            System.out.println("Lower Seat");
        }
        else if (rem == 2 || rem== 5) {
            System.out.println("Middle Seat");
        }
        else if (rem == 3 || rem==6) {
            System.out.println("Upper Seat");
        }
        else if (rem == 7) {
            System.out.println("Side lower");
        }
        else if (rem==0){
            System.out.println("Side Upper");
        }
    }
}
