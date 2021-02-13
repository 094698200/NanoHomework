
import java.util.Matcher;
import java.util.Pattern;

public class PerssonT7For {
    public static void main(String[] args) {
        String input = "Hello! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("J");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
