package day17;
import java.util.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(5);
        ts.add(7);
        ts.add(2);
        ts.add(6);
        System.out.println(ts);
        Iterator i = ts.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" "); 
       System.out.println("\n");

        }
        for (int j : ts) {
            System.out.print(j + " ");
        }
        
        //descending
         TreeSet<Integer> descending = new TreeSet<>(Comparator.reverseOrder());
        descending.add(2);
        descending.add(5);
        descending.add(7);
        descending.add(2);
        descending.add(6);
        System.out.println(descending);
        //descending with duplicates
         TreeSet<Integer> desDup = new TreeSet<>((a,b)-> (a<b?1:-1));
        desDup.add(2);
        desDup.add(5);
        desDup.add(7);
        desDup.add(2);
        desDup.add(6);
        System.out.println(desDup);
        //descending Iterator without affecting data
        Iterator dIt = ts.descendingIterator();
        while (dIt.hasNext()) {
            System.out.print(dIt.next() + " ");
        }
        System.out.println(ts); 
    }
}
