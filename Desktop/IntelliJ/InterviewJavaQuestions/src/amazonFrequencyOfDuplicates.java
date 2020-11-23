import java.util.*;

public class amazonFrequencyOfDuplicates {

    /**
     Write a program to identify the frequency of duplicates words in a  string. Print duplicates words and their frequency.

     Input: "java is java best language is java"
     Output:
     java: 3
     is: 2
     */

    public static void main(String[] args) {

duplicty2("hello hello is is my java");


    }

    public static void duplicty(String str){

        String[] arr=str.split(" ");

        for(int i=0; i< arr.length; i++){
            int count= Collections.frequency(Arrays.asList(arr), arr[i]);
            if( count>1) {
                System.out.print(arr[i]+" : " + count + ", ");

            }
        }
    }
    public static void duplicty2(String str){
        String[] arr=str.split(" ");
        List<String> stringList= new ArrayList<String>(Arrays.asList(arr));
        for (int i = 0; i <stringList.size() ; i++) {
            String s = stringList.get(i);
            int count = Collections.frequency(stringList, s);
            if (count > 1) {
                System.out.println(stringList.get(i)+":"+count);
                stringList.remove(s);
            }

        }
        }

        }


