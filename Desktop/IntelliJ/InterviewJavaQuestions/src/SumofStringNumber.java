import com.sun.jdi.IntegerValue;

public class SumofStringNumber {

    public static void main(String[] args) {
        String str = "AB2C5G6";
        System.out.println(sumOfNumbers(str));
    }
    public static int sumOfNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                sum += Integer.valueOf(""+str.charAt(i));
            }
        }
        return sum;

    }
}
