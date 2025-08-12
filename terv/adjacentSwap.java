public class adjacentSwap {
    public static void main(String[] args) {
        int num = 1234567;
        int reverse = 0;
        while(num>0){
            reverse = (reverse*10)+(num%10);
            num/=10;
        }
        System.out.println(reverse);
        int adjacent = 0;
        while (reverse>0) {
            adjacent = (adjacent*100)+(reverse%100);
            reverse /= 100;
        }
        System.out.println(adjacent);
    }
}
