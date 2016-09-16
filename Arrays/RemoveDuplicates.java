package javatest1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ashwin on 13/09/2016.
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] a = {2, 2, 12, 12, 12, 3, 4, 1, 3, 1};

        //print original array
        System.out.println(Arrays.toString(a));

        //remove duplicates
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }

        //convert set back to array
        int[] b = new int[set.size()];
        int i = 0;
        for(int item : set)
        {
            b[i++] = item;
        }
        System.out.println(Arrays.toString(b));

        //or use iterator to get individual items of set
        Iterator it = set.iterator();
        while( it.hasNext() ) {
            System.out.print( it.next()+" " );
        }

        //or simply print the set
        System.out.println("\n"+set);

    }

}
