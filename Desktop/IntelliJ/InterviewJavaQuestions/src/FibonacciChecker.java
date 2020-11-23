import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FibonacciChecker {

    public static void main(String[] args) {


        System.out.println(fibonacciChecker(1));
    }

    public static String  fibonacciChecker(int num) {

        ArrayList<Integer> fibonacci = new ArrayList<>(); // 0,1,1

        fibonacci.add(0);
        fibonacci.add(1);

        do{ fibonacci.add(
                    fibonacci.get(fibonacci.size()-1) +
                            fibonacci.get(fibonacci.size()-2));

        } while( num > fibonacci.get(fibonacci.size()-1)) ;

      System.out.println(fibonacci.toString());

       int indexOfNum= fibonacci.indexOf(fibonacci.get(fibonacci.size()-1));

        return fibonacci.contains(num)? "yes true it is fibonacci number and it's index : "+indexOfNum : "it is not fibonacci number";


    }

}
