import java.util.ArrayList;


public class HeavyBoxOne {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        arrayList.remove(1);

        System.out.println(arrayList);
        arrayList.add(1,1);

        System.out.println(arrayList);
         arrayList.remove(9);

        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }
}
