import java.util.ArrayList;
import java.util.List;

public class StreamTwoTre {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.stream().forEach(s ->
                System.out.println(s + 1));

    }
}
