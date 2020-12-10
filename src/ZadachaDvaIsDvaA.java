import java.util.Scanner;

public class ZadachaDvaIsDvaA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a");
        int a = in.nextInt();
        System.out.print("b");
        int b = in.nextInt();

        for (int i = b - 1; i > a; i--)
            System.out.println(i);
        System.out.println(b - a - 1);
        in.close();
    }
}

