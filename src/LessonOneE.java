import java.util.ArrayList;
import java.util.Scanner;

public class LessonOneE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int ar[] = {n,n1,n2,n3};
        int a = ar.length;
        int res = (ar[0] + ar[1] + ar[2] + ar[3])/n;
        System.out.println(res);

    }
}
