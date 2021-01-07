import java.util.ArrayList;


public class LessonsThre5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("test1");
        arr.add("bla_test2");
        arr.add("test3");
        arr.add("bla_test4");
        arr.add("bla_test5");

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).startsWith("bla")) {
                System.out.println("i = " + i + "; object: " + arr.get(i));
                arr.remove(i);
            }
        }
    }
}