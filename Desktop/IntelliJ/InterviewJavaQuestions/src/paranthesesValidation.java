import java.util.*;

public class paranthesesValidation {

    public static void main(String[] args) {


        System.out.println(isBalanced("(){{{}]"));
    }
        static HashMap<Character,Character> bracket_map = new HashMap<>();

        static {
            bracket_map.put(')','(');
            bracket_map.put('}','{');
            bracket_map.put(']','[');
        }

        static boolean isBalanced(String s){

            Stack<Character> stack = new Stack<>();
            char temp;
            for (int i = 0; i < s.length(); i++) {
                temp = s.charAt(i);
                if(temp == '{' || temp == '[' || temp == '('){
                    stack.push(temp);
                }else {
                    if(stack.isEmpty() || stack.peek() != bracket_map.get(temp)) return false;
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }

