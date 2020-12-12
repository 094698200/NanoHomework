package java;

import java.util.Arrays;
//b)
public class LessonTwoTwoTre {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int size = myArray.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[size - 1 - i];
            myArray[size - 1 - i] = temp;
        }
        System.out.println("Array after reverse:: ");
        System.out.println(Arrays.toString(myArray));
    }
}