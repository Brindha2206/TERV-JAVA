package day29;
import java.util.*;
public class bricks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bricks[] = new int[n];
        for (int i = 0; i < n; i++) {
            bricks[i] = sc.nextInt();
        }
        Arrays.sort(bricks);
        int secondMax = bricks[n - 2];
        System.out.println(secondMax);
             // int max = 0;
        // int secondMax = 0;
        // for(int i = 0;i<n;i++){
        //     if (max<bricks[i]) {
        //         secondMax = max;
        //         max = bricks[i];
        //     }
        // }
        
        
    }
}
