import java.util.Scanner;

public class ZadachaAdinIaDvaE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int)sc.nextFloat();
        int y = 0;
        if (x > 0) {
            y = x - 5;
        } else if (x == 0) {
            x = 0;
        } else if (x < 0) {
            y = 3 * x - 5;
        }

        System.out.println(y);

    }
}
