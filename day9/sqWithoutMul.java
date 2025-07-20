package day9;

public class sqWithoutMul {
    public static void square(int n){
        int sum = 0;
        int value = n;
        for(;n> 0;n=n>>1){
            if ((n&1)==1) {
                sum= sum+value;
            }
            value = value+value;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        square(9);
    }
}
