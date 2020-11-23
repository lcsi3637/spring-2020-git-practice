import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class start1 {
    public static void main(String[] args) {

        int a=20;
        int b=30;
        System.out.println(a+"-"+ b);

         b=a+b;
         a=b-a;
         b=b-a;

        System.out.println(a+"-"+ b);


    }


    public int start1(int[] a, int[] b) {
        int count = 0;


        for (int e : a) {
            if (e == 1) {
                count++;
            }

        }
        for (int e2 : b) {
            if (e2 == 1) {
                count++;
            }

        }


        return count;
    }

}

/**
 *
 Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


 */
