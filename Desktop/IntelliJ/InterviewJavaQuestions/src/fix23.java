import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fix23 {
    public static void main(String[] args) {
        int[] nums= new int[] { 2,3,5};


        System.out.println(Arrays.toString(fix23(nums)));
    }

    public static int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i+1]==3) {
                nums[i+1]=0;
            }

        }
       return nums;
    }


}
