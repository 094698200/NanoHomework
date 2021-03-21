import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
        Stream<String> stream = stringList.stream();
        String s = stream.toString();
        System.out.println(stringList);
    }
}
