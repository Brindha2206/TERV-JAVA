// package day6;

public class trailingZero {
    public static void main(String[] args) {
        int n = 60;
        // if (n<25) {
        //     n = n/5;
        // }
        // else if (n<125) {
        //     n = n/5 + n/25;
        // }
        // else if(n<625){
        //     n = n/5 + n/25 + n/125;
        // }
        n = n/5 + n/25 + n/125 + n/625;
        System.out.println(n);
    }
}
