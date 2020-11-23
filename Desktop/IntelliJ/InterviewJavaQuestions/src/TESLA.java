import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TESLA {
    public static void main(String[] args) {

//        String givChar = "BALLOONRGTBALLOONDFGDFGBALLOON";
//
//        char[] arrGiv = givChar.toCharArray();
//        List<Character> cList = new ArrayList<Character>();
//        System.out.println(cList);
//        System.out.println(cList);
//        for (char c : arrGiv) {
//            cList.add(c);
//        }
//
//        System.out.println(cList+"--");
//        String b = "BALLOON";
//        char[] arrHello = b.toCharArray();
//
//        System.out.println(Arrays.toString(arrHello));
//
//        boolean isReturn = true;
//        int count = 0;
//
//        while (isReturn) {
//
//            for (int i = 0; i < arrHello.length; i++) {
//                if (cList.contains((Character) (arrHello[i]))) {
//                    cList.remove((Character) arrHello[i]);
//                } else {
//                    isReturn = false;
//                }
//            }
//
//            if (isReturn) {
//                count++;
//            }
//
//
//        }
//        System.out.println(count);

        System.out.println(solution("BALLOONLOOLBANsfhsf"));

    }
        public static int solution (String givenCharacter){

            char[] arrGiven = givenCharacter.toCharArray();
            List<Character> cList = new ArrayList<Character>();
            String b = "BALLOON";
            for (char c : arrGiven) {
                cList.add(c);
            }
            char[] arrBallon = b.toCharArray();
            boolean isReturn = true;
            int count = 0;

            while (isReturn) {
                for (int i = 0; i < arrBallon.length; i++) {
                    if (cList.contains(arrBallon[i])) {
                        cList.remove((Character) arrBallon[i]);
                    } else {
                        isReturn = false;
                    }
                }
                if (isReturn) {
                    count++;
                }
            }
            return count;
        }

}