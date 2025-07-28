package day16;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedListCollections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> List = new LinkedList<Integer>();
        List.add(1);
        List.add(4);
        List.add(3);
        List.add(2);
        Iterator i = List.iterator();
        int a =sc.nextInt();
        while (i.hasNext()) {
            System.out.print(i.next());
        }
    }
}
