import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class string_Challenge {


    public static String SC(String str) {

        String[] result = str.split("");

        for (int i = 0; i <result.length ; i++) {
            if(i+4<result.length && result[i]=="a" && result[i+4]=="b"){
                str="true";
            }else{ str="false";}
        }


//        String[] result = str.split("");
//        for (int i = 0; i < result.length; i++) {
//            if (result[i].equalsIgnoreCase("a")) {
//                if ((i+4) < result.length) {
//                    if (result[i + 4].equalsIgnoreCase("b")) {
//                        str = "true";
//                    } else
//                        str = "false";
//                } else
//                    str = "false";
//            }
//        }
//


        return str;
    }

    public static void main(String[] args){
int count=3;
while(count>0){

        Scanner s= new Scanner(System.in);
        System.out.println(SC(s.nextLine()));
count--;
    }}
}