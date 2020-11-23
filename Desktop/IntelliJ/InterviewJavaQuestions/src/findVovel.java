import java.util.Scanner;

public class findVovel {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        int vowel=0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                System.out.println(i);
                vowel++;
            }
        }

        if(vowel==0){
            System.out.println("there is no any vowel in that word!!!");
        }


    }
}

