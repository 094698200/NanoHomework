import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PerssonT7For {
    public static void main(String[] args) {
        String input = "Hello! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("J");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}