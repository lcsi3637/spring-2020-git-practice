import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();


        if (username.equals("cybertek") && password.equals("cybertek12345")) {
            System.out.println("Logged In");
        } else {
            for (int i = 1; i <= 3; i++) {

                if (i == 3) {
                    System.out.println("your account has been locked");
                    System.exit(0);
                }
                System.out.println("invalid username or password, please try again");
                System.out.println("Enter your username");
                username = scan.next();

                System.out.println("Enter your password");
                password = scan.next();
                if (username.equals("cybertek") && password.equals("cybertek12345")) {
                    System.out.println("Logged In");
                    break;
                }
            }
        }


    }
}
