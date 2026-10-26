import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {

            if (i == 2) {
                continue;
            }
            if (i == 4){
                continue;
            }
            if (i == 6){
                continue;
            }
            if (i == 8){
                continue;
            }

            if (i == 10) {
                break;
            }

            System.out.println(i);
        }

        return;
    }
}
