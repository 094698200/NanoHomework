

public class Faktoreal {


    public static void main(String[] args) {
        System.out.println(Test.calculateFactorial(4));
    }
    }



class Test {
    static int calculateFactorial(int n) {

        int result = 1;
        for (int i = 0; i != n; i++) {
            result = result * i;
        }
        return result;
    }

}