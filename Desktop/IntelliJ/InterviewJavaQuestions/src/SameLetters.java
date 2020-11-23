import java.util.Arrays;

public class SameLetters {
    /***
     * Write a return method that check if a string is build out of the same letters as another string.
     *
     * Ex:  same("abc",  "cab"); -> true
     *
     * same("abc",  "abb"); -> false:
     *
     */


    public static void main(String[] args) {

        String word1="aabbccdd";
        String word2="ddccaabb";

        System.out.println(same(word1,word2));

    }

    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;



        for(char each: ch2)

            a2 +=each;



        return  a1.equals(a2) ;

    }
}


