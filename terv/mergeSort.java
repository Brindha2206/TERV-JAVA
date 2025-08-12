import java.util.Scanner;
import java.util.*;
public class mergeSort {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            for(int i = 0 ;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            for(int i = 0; i<m;i++){
                arr2[i] = sc.nextInt();
            }
            int len = n+m;
            int mergedArray[] = new int[len];
            for(int i = 0 ; i<n;i++){
                mergedArray[i] = arr1[i];
            }
            for(int i = 0; i< m;i++){
                mergedArray[n+i] = arr2[i];
            }
            // Arrays.sort(mergedArray);
            System.out.print(mergedArray[0]+" ");
            int i =0;
                for(int j = i+1 ; j<len;j++){
                    if(mergedArray[i]!=mergedArray[j]){
                        System.out.print(mergedArray[j]+ " ");
                    }
                    i++;
                }
            
        }
    }
