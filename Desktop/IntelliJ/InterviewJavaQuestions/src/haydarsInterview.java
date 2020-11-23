public class haydarsInterview {
    public static void main(String[] args) {

        int[] example = {1, 0, 1, 2, 6, 3, 3, 2};
        int given = 6;

        for (int i = 0; i < example.length; i++) {

            if (example[i] == given) {
                System.out.println("indexOf given " + i);
                break;
            }

        }
    }}
