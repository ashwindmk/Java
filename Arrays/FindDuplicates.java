import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ashwin on 15/08/2016.
 */

//finds duplicate items from an array
public class FindDuplicates {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 1, 10, 4, 4, 10, 10, 2};

        Set<Integer> set = new HashSet<>();

        for(int x : a) {
			//set does not add the item if it is a duplicate
            if(!set.add(x)) {
				//print the item if it is not added to the set
                System.out.print(x+" ");
            }
        }
    }
}
