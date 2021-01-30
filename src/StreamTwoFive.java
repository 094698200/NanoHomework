import java.util.ArrayList;
import java.util.List;

public class StreamTwoFive {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-2);
        list.add(10);
        list.add(7);

        list.stream().forEach(s -> {
            if(s <0 )
                System.out.println(s + 3);


        });
    }

}
