import java.util.Arrays;

public class biggerTwo {
    public static void main(String[] args) {

       int[] a={1,2};
       int[] b={3,4};
        System.out.println(Arrays.toString(biggerTwo(a, b)));
    }
    public static int[] biggerTwo(int[] a, int[] b) {

        int count1 = 0;
        int count2=0;
        int[] result=new int[2];

        for (int e : a) {

            count1+=e;
        }


        for (int e2 : b) {

            count2+=e2;
        }




        return result;
    }



}
