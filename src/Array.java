
import java.util.*;

    public class Array {
        public static void main(String[] args) {


            HashSet<String> hashSet = new HashSet<>();

            LinkedList list = new LinkedList();
            list.add("LinkedList");
            list.add("List");
            HashSet hashSet1 = new HashSet(list);
            HashSet hashSet2 = new HashSet<>(25);
            HashSet hashSet3 = new HashSet<>(30, 0.90F);
             hashSet.add("Hello");
               hashSet.add("Hello");
               hashSet.add("lo");
               hashSet.add("Hel");
               hashSet.add("My name is Vasia");

          hashSet.addAll(list);
           System.out.println(hashSet.isEmpty());
            System.out.println(hashSet2.isEmpty());
            System.out.println(hashSet.contains("Vova")  + " -Vova ");
            System.out.println(hashSet.contains("Is" ) + " -Is ");
           hashSet.remove("Vasia");
            System.out.println(hashSet);
            System.out.println(hashSet.size());
            hashSet.clear();
            System.out.println(hashSet);

        }
    }