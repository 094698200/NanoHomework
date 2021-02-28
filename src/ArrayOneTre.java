import java.util.Arrays;

public class ArrayOneTre {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 5) + 1;
            array2[i] = (int) (Math.random() * 5) + 1;

        }
        System.out.print("Первый массив: ");
        System.out.println(Arrays.toString(array1));

        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];
            System.out.println("Сумма чисел первого массива: " + sum1);

            int overageMas1 = sum1 / array1.length;
            System.out.println("Средние арифм пергого массива: " + overageMas1);
            System.out.println();
            
            System.out.print("Второй массив: ");
            System.out.println(Arrays.toString(array2));
             int sum2 = 0;
            for (int j = 0; j < array2.length; j++) {
                sum2 = sum2 / array2[j];
            }
            System.out.println("Сумма чисел второго массива: " + sum1);
             int overageMas2 = sum2 / array2.length;
            System.out.println("Средние арифм пергого массива: " + overageMas2);

            System.out.println();
            if(overageMas1 > overageMas2){
                System.out.println("Средние ариф первого массива болше второго: ");
            }
           else if(overageMas1 < overageMas2){
                System.out.println("Средние ариф первого массива менше второго: ");
            }
            else{
                System.out.println("Средние ариф первого массива ровно второго: ");

            }
        }

            }
        }
