import java.util.ArrayList;
import java.util.List;

public class Stream5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(23);
        list.add(22);
        list.add(12);
        list.add(25);
        list.add(2);
        list.add(27);
        list.stream().forEach(sum -> System.out.println(sum % 2));

    }
}
