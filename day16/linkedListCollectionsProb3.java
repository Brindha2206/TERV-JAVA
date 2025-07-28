package day16;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedListCollectionsProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> List1 = new LinkedList<Integer>();
        LinkedList<Integer> List2 = new LinkedList<Integer>();
        LinkedList<Integer> merged = new LinkedList<Integer>();
        for(int i = 0;;i++){
            int a = sc.nextInt();
            if (a==-1) {
                break;
            }
            List1.add(a);
        }
        for(int i = 0;;i++){
            int a = sc.nextInt();
            if (a==-1) {
                break;
            }
            List2.add(a);
        }
        merged.addAll(List1);
        System.out.println(merged);
        merged.addAll(List2);
        System.out.println(merged);
        Collections.sort(merged);
        System.out.println(merged);
    }
}
