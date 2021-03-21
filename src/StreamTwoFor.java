import java.util.ArrayList;
import java.util.List;

public class StreamTwoFor {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Мама мыла рам");
        list.add("Саша кушает каш");
        list.add("Лал");
        list.add("Таня ");

        list.stream().forEach(s ->
                System.out.println(s + "y"));

    }

}
