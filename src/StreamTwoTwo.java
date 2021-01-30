import java.util.ArrayList;
import java.util.List;

public class StreamTwoTwo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ka");
        list.add("Ap");
        list.add("Mam");
        list.add("Ra");
        list.add("Pa");
        list.add("Sash");
        list.stream().forEach(s -> {
            if (s.length()==2) { s = s + "a"; }
            System.out.println(s);

        });
    }
}



