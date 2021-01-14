import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LessonsOne4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}
