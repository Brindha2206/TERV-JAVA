import java.util.*;
public class minCombinationSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = {0,1,4,9,16,25,36,49,64,81,100};
        // int n = sc.nextInt();
        // for(int i =arr.length-1;i>=n;){
        //     if (n<arr[i]) {
                
        //     }
        // }
        ///optimised version
        for(int i=sc.nextInt();i!=0;System.out.print((int)Math.sqrt(i)+" "),i=i-(int)Math.sqrt(i)*(int)Math.sqrt(i));
        sc.close();
    }
}
