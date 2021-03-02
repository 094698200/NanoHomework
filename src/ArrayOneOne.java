import java.util.Arrays;

public class ArrayOneOne {
    public static void main(String[] args) {

        int[] array = new int[]{1, -2, 3, -4,15,17,-29, 5};
        System.out.println("nechyotnie");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
        System.out.println("chyotnie");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);

            }
        }
    }
}