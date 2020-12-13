package java;

public class LessonTwoTwoC {
    public static void main(String[] args) {
        int []array = {12,13,14,15};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];

        }
        System.out.println("Средно арифметьичское" + result/array.length);
    }
}
