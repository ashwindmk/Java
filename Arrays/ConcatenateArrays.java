import java.util.Arrays;

/**
 * Created by Ashwin on 15/08/2016.
 */

//concatenates one array to another
public class ConcatenateArrays {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        int[] b = {10, 20, 30, 40, 50};

        int[] temp = new int[a.length + b.length];

        //copies a to temp
        System.arraycopy(a, 0, temp, 0, a.length);

        //adds b to temp
        System.arraycopy(b, 0, temp, a.length, b.length);

        //copies temp to a
        a = temp;

        System.out.println( Arrays.toString(a) );

    }
}
