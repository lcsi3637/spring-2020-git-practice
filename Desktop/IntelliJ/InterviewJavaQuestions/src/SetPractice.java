import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetPractice {}

     class person {
         String name;
         int age;

         @Override
         public String toString() {
             return "person{"+
                     "name='"+name+'\''+
                     ", age="+age+
                     '}';
         }

         person(int age, String name) {
             this.name = name;
             this.age = age;
         }


         public static void main(String[] args) {

             person p1 = new person(25, "bla");
             person p2 = new person(26, "bla-bla");

             Set <Object> set = new HashSet<>();
             set.add(p1);  set.add (p2);

             System.out.println(set.toString());
         }

     }
//    Tell me whats wrong with it?It can be anything so look for declaration of collections, constructor, syntax.
//    I answered correctly, and then he changed the code into this:
//    Set<Object> set = new HashSet<>();
//set.add(p1);  set.add (p2);





