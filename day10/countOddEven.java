package day10;

import java.util.Scanner;

public class countOddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int countOdd = 0;
        int countEven =0;
        while(nums>0){
            int digit = nums%10;
            if((digit&1)==1){
                countOdd++;
            }
            else{
                countEven++;
            }
            nums/=10;
        }
        System.out.println("ODD "+ countOdd);
        System.out.println("EVEN"+ countEven);
    }
}
