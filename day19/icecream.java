package day19;

import java.util.*;

public class icecream {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // int[] odd = new int[];
        // int[] even = new int[];
        int[] arr = new int[n];
        int index = 0;
        for(int i=1;i<=n;i++){
            if((i%2)!=0){
                arr[index]=i;
                index++;
            }
        }
        for(int i = 1;i<=n;i++){
            if((i%2)==0){
                arr[index]=i;
                index++;
            }
        }
        System.out.print(arr[k-1]);
    }
}