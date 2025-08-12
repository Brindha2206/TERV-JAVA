package day30;

import java.util.Scanner;

public class factorialOptimization {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int f = 1;
        // for(int i = 1;i<=n;i++){
        //     f = f*i;
        // }
        // System.out.println(f);
        //optimization
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int f = 1;
         for(int i =1, j = n;i<j;f = f*i*j,i++,j--){
            System.out.println((n%2==0)?(f):(((n/2)+1)*f));
         }
         sc.close();
    }
}
