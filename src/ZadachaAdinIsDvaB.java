import java.util.Scanner;

public class ZadachaAdinIsDvaB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextFloat();
        double y;
        if (x > 0) {
            y = 2;
        } else if (x == 0) {
            y = 0;
        } else if(x < 0){
            y = 2 * x -1;
        }
        System.out.println('y');
    }
}
