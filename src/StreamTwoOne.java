import java.util.ArrayList;
import java.util.List;

public class StreamTwoOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);          list.add(3);
        list.add(9);          list.add(5);
        list.add(23);         list.add(33);
        list.add(22);         list.add(10);
        list.add(12);         list.add(13);
        list.add(25);         list.add(24);
        list.stream().forEach(s -> {
            if (s % 2 == 0 ) {
                System.out.println("Chyotnie chislo");
            } else if(s % 2==1 + 1){
                System.out.println("Ne chyotnie chislo");
            }
        });
    }

}
