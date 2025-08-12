package day30;

import java.util.Scanner;

public class primeOptimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        //1   O(N)
        // for(int i = 1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // System.out.println((count==2)?("prime"):("Not a Prime"));
        //2    O(N-2)
        //    for(int i = 2;i<n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // System.out.println((count==0)?("prime"):("Not a Prime"));

        //3    O(N/2)
    //     if(n%2==0){
    //         System.out.println("Not a Prime");
    //     }
    //     else if(n==2){
    //         System.out.println("Prime");
    //     }
    //     else{
    //         for(int i = 3;i<n;i+=2){
    //             System.out.println((n%i==0)?("Not a Prime"):("Prime"));
    //     }
    // }

    //4 
     if(n==2||n==3){
        System.out.println("Prime");
    }
     else if(n%2==0){
            System.out.println("Not a Prime");
        }
        else{
            for(int i = 4;i<n;i+=3){
                count++;
            }
            System.out.println((count==0)?("Prime"):("Not a Prime"));
           
}
//5 O(n/2)
int c =1;
for(int i = 2;i<=n/2;i++){
    if(n%i==0){
        c=0;
        break;
    }
}
 System.out.println((c==1)?("Prime"):("Not a Prime"));
 //6 O(root-n)
  
}
}
