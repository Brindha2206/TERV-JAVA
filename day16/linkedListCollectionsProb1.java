//program to find whether the input element is present in the list or not without knowing the size

package day16;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedListCollectionsProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> List = new LinkedList<Integer>();
        for(int i = 0;;i++){
            int a = sc.nextInt();
            if (a==-1) {
                break;
            }
            List.add(a);
        }
        System.out.println(List);
        int n = sc.nextInt();
        System.out.println(List.contains(n)?"Yes":"No");
    }
}
