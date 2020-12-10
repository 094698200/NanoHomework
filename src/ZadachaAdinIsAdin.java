import java.util.Scanner;


public class ZadachaAdinIsAdin {
//a)
        public static void main(String args[]) {
            int num ;
            System.out.println("Введите число:");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if ((num % 2) == 0){
                System.out.print("Четное число " + num);
            }else {
                System.out.print("Не четное число " + num);
            }
        }
}