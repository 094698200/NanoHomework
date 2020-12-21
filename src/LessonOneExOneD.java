import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessonOneExOneD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(String.valueOf(reader.read()));
        switch (n) {
            case 0:
                System.out.println("продолжать движение");
                break;
            case 1:
                System.out.println("поворот налево");
                break;

            case -1:
                System.out.println("поворот направо");
                break;
            default:

        }
        }
}
