package day10;

import java.util.Scanner;

public class neonRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sq = 0;
        for(int i = num1; i<= num2; i++){
            int sum =0;
            sq = i*i;
            int temp = sq;
            while(temp>0){
                int digits = temp %10;
                sum = sum + digits;
                temp/=10;
            }
            if(i == sum){
                System.out.print(i + " ");
            }
        }
    }
}
