public class ZadachaOneIsOne {
    public static void main(String[] args) {
        int sum = 15;
        if(sum > 0){
            sum = sum + 1;
        }else if(sum < 0){
            sum = sum - 2;
        }else if(sum == 0){
            sum = 10;
        }
        System.out.println(sum);
    }
}

