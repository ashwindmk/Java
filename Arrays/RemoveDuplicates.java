import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ashwin on 15/08/2016.
 */

//removes duplicate items from an array
public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] a = {2, 2, 12, 12, 12, 3, 4, 1, 3, 1};

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }

        //use iterator to get individual items of set
        Iterator it = set.iterator();
        while( it.hasNext() ) {
            System.out.print( it.next()+" " );
        }

        //or simply print the set
        System.out.println("\n"+set);

    }
}
