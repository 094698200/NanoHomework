import jdk.internal.icu.impl.StringPrepDataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessonOneEsTho {


    public static void main(String[] args) throws IOException {

        int num = 7;
        int y;
        if (num > 0){
           y  = num + 1;
        }else if(num == 0) {
            y = 0;
        } else if(num < 0){
            num = 3 *( num) - 5;
           }

            System.out.println(num);
        }
    }




