/**
 * Created by Ashwin on 15/08/2016.
 */

//finds factorial of a number
public class Factorial {
    public static void main(String[] args) {

        int n = 5;

        System.out.println( n + "! = " + factorial(n) );

        //output: 5! = 120

    }

    //returns factorial
    private static int factorial(int n) {
        int i = 1;

        if( n > 0 ) {
            return n*factorial(n-1);
        }

        return i;
    }
}
