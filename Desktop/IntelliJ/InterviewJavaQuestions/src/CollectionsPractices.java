import sun.tools.jconsole.inspector.XObject;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class CollectionsPractices {

    public static void main(String[] args) {

//       // ArrayList<Integer> list1=new ArrayList(Arrays.asList(1,1,1,1,1,1,2,3,4,4,5,6,7,7));
//        List<Integer> list1=new LinkedList<Integer>(Arrays.asList(1,1,2,2,2,3,3,3,4,4,5,6,7));
//
//        for(int i=0; i<list1.size();i++) {
//
//            if (list1.get(i) < 15)
//                System.out.println(list1.get(i));
//            list1.remove(i);
//
//            list1.add(i);
//        }

      // // System.out.println(list1);

      //  Set<Integer> set1= new HashSet<>(Arrays.asList(1,2,45,5,6,6,6,7,8,9,9,9));
        Set<String> set1= new HashSet<String>(Arrays.asList("q","a","c","B"));
      //  Set<Integer> set1= new LinkedHashSet<>(Arrays.asList(1,2,45,5,6,6,6,7,8,9,9,9));
       // Set<Integer> set1= new TreeSet<>(Arrays.asList(1,2,45,5,6,6,6,7,8,9,9,9));
        System.out.println(set1);
        set1.add("Z");
        System.out.println(set1);
        set1.add("L");
        System.out.println(set1);


        set1.remove("L");
        set1.add("L");
        set1.add("d");
        set1.add("b");
        System.out.println("::::::_____::::");

        //set1.clear();
        System.out.println(set1.isEmpty());
        System.out.println(set1);

        String[] arr= {"b","naber","iyidir"};
        List<String> ilave= Arrays.asList(arr);
        ilave.add("iyidir bea");
        System.out.println(ilave);
        ArrayList<Object> list2= new ArrayList();

        list2.add("hello");
        list2.add(1);
        list2.add('c');

        list2.add(2,"world");

        list2.addAll(set1);

        list2=new ArrayList<Object>(){
            {
                add("hi");
                add("how");
                add("are");
                add("you");
            }
        };

        System.out.println(list2);





    }}

