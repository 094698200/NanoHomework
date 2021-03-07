public class ArrayJava {
    public static void main(String[] args) {
        int[] mas = {3, 3, 8, 9, 7, 8, 4, 6, 6, 8, 6, 9, 8, 6, 3, 3, 3, 5};

        int a = 0;
        int d = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length - 1; j++) {
                if (mas[i] == mas[j]) {
                    a = mas[i];
                    d++;

                }

            }
            System.out.println("элемент " + a + " встречается " + d + " раз\n");
            d = 0;
            break;
        }
    }
}
