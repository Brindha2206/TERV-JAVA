
//program to find whether the input element is present in the list or not with knowing the size
package day16;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedListCollectionsProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<Integer> List = new LinkedList<Integer>();
        for(int i = 0 ; i<size; i++){
            List.add(sc.nextInt());
        }
        System.out.println(List);
        int n = sc.nextInt();
        System.out.println(List.contains(n)?"Yes its present":"No not present");
    }
}
