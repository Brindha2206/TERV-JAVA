package day17;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('b');
        hs.add('u');
        hs.add('c');
        hs.add('a');
        System.out.println(hs);
        //Iterator
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        //for loop
        for(char i : hs){
            System.out.print(i + " ");
        }
    }
}
