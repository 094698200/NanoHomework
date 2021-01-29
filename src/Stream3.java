import java.util.ArrayList;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ko");
        list.add("S");
        list.add("Max");
        list.add("Lil");
        list.stream().forEach(s ->{
            System.out.println(s + "i");


        });

    }
}
