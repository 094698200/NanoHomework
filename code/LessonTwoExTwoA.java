import java.util.Arrays;

public class LessonTwoExTwoA {
    public static void main(String[] args) {
        int [] mas = new int[8];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*100)+50;
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if(i%2 == 1){
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
