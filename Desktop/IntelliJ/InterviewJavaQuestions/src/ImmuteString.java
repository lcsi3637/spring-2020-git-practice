public class ImmuteString {


    public static void main(String[] args) {

        String str = new String("Cybertek");

        str.concat(" School");

        String str1=str.substring(0,1);

        str.toLowerCase();

        System.out.println(str1);
    }
}

//It is possible to reassign but it is impossible to change existing value of the string.
