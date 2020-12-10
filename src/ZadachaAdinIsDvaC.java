import java.util.Scanner;

public class ZadachaAdinIsDvaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int) sc.nextFloat();
        int y ;

        if (x > 0) {
            y = x - 5;
        } else if (x == 0) {
            y = 0;
        } else if (x < 0) {
            y = x -1;
        }

        System.out.println('y');
    }

}
