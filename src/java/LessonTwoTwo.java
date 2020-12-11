package java;

import java.util.Scanner;
//A)
public class LessonTwoTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = input.nextInt();
        System.out.println("Result: " + calculate(N));
    }

    public static double calculate(int N){
        double result = 0;
        for (int i = 1, j = N; i <= N && j >= 1; i++, j--) {
            result += Math.pow(i, j);
        }
        return result;
    }
    }

