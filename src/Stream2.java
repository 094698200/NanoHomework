import java.util.ArrayList;
import java.util.List;


public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(22);
        list.stream().forEach(sum ->{
            System.out.println(sum * 2);


        })
        ;

    }
}
