public class ZadachaOneIsTho {
    public static void main(String[] args) {
        int f = 0;
        int x = 2;
        int y = 21;
        if(x > 0){
            y = x + 1;
        }else if(x == 0){
            y = 0;
        }else if(x < 0){
            y = 3 * x - 5;
        }
        System.out.println(y);
    }
}
