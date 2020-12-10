import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZadachaAdinIsAdinE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number < 0) {
            number = number * 2;
        } else if (number > 0) {
            number = number * 3;
         }else if(number == 0){
            number = 10;
        }
        System.out.println(number);

    }
}



