import java.util.ArrayList;
import java.util.List;

public class Room {
    private int number;
    List<Staff>staffs = new ArrayList<>();

        private Devise devise;

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void addStaff(Staff staff){
        staffs.add(staff);

    }
    public void showStaff(){
        staffs.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", staff=" + staffs +
                ", devise=" + devise +
                '}';
    }
}
