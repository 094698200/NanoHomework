import java.util.ArrayList;
import java.util.List;

public class Offise {

    private static Object Room;
    private List<Room>rooms = new ArrayList<>();
    private static Object Room1;
    private static Object Room2;

    public static Object getRoom() {
        return Room;
    }

    public static void setRoom(Object room) {
        Room = room;
    }

    public Object getRoom2() {
        return Room2;
    }

    public void setRoom2(Object room2) {
        Room2 = room2;
    }

    public Object getRoom1() {
        return Room1;
    }

    public void setRoom1(Object room1) {
        Room1 = room1;
    }

    public void addRoom(Room room){
        rooms.add(room);
        }

    private Room setRoom2() {
        return setRoom2();
    }

    void showOffice(){
        rooms.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Offise offise = new Offise();
        offise.setRoom(0);
       offise.setRoom1(1);
       offise.setRoom2(2);
       Scanner scanner = new Scanner();
        scanner.setState(State.ON);
        scanner.setDeviceName("Scaner");
        scanner.setDeviceNumber(23);

        Printer printer = new Printer();
        printer.getState(State.ON);
        printer.setDeviceName("Printer");
        printer.setDeviceNumber(22);


        Combine combine = new Combine();
        combine.setState(State.ON);
        combine.setDeviceName("Combine");
        combine.setDeviceNumber(12);

        Staff  arra = new Staff();
        arra.setName("Arra");
        arra.setSurname("Avagyan");
        arra.setPatronymic("Aharoni");

        Staff mara = new Staff();
        mara.setName("Mara");
        mara.setSurname("Avetisyan");
        mara.setPatronymic("Sergeyi");

        Staff karen = new Staff();
        karen.setName("Karen");
        karen.setSurname("Karapetyan");
        karen.setPatronymic("Vazgeni");

        Staff sergey = new Staff();
        sergey.setName("Sergey");
        sergey.setSurname("Stepanyan");
        sergey.setPatronymic("Stepani");

        Staff vazgen = new Staff();
        vazgen.setName("Vazgen");
        vazgen.setSurname("Vardanyan");
        vazgen.setPatronymic("Sahaki");

        Staff sara = new Staff();
        sara.setName("Sara");
        sara.setSurname("Marati");

        Staff zara = new Staff();
        zara.setName("Zara");
        zara.setSurname("Zargaryan");
        zara.setPatronymic("Zaqari");

        Staff marat = new Staff();
        marat.setName("Marat");
        marat.setSurname("Margaryan");
        marat.setPatronymic("Mishayi");

        Room room = new Room();
        room.setDevise(printer);
        room.addStaff(arra);
        room.addStaff(zara);
        room.addStaff(mara);
        System.out.println(room);

        Room room1 = new Room();
        room1.setDevise(scanner);
        room1.addStaff(sara);
        room1.addStaff(vazgen);
        room1.addStaff(sergey);
        System.out.println(room1);

        Room room2 = new Room();
        room2.setDevise(combine);
        room2.addStaff(karen);
        room2.addStaff(marat);
        System.out.println(room2);

        
    }



}
