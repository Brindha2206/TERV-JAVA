package day16;
import java.util.*;
import java.util.ArrayList;

public class arrayCollections {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(4);
        alist.add(5);
        alist.add(7);
        System.out.println(alist);
        //Iterator
        Iterator i = alist.iterator();
        System.out.println(i.next());

    }
}
