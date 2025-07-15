package day3;

public class reverse {
    public static void main(String[] args) {
        int num = 123456;
        int reverse = 0;
        int adjacent = 0;
        
        while (num>0) {
            reverse = (reverse*10)+(num%10);
            num /= 10;
        }
        System.out.println(reverse);
        while (reverse>0) {
            adjacent = (adjacent*100)+(reverse%100);
            reverse /= 100;
        }
        System.out.println(adjacent);
    }
}
