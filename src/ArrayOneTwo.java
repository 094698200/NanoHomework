import java.util.Arrays;

public class ArrayOneTwo {
    public static void main(String[] args) {
        int [] array = {2,3,4,1,8,7,6,5};
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Arrays.stream(array).max());

        }
    }
}