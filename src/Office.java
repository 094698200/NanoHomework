import java.util.ArrayList;

public abstract class Office {
    private Room1 room1;
    private Room2 room2;
    private Room3 room3;

    private Scanner scanner;
    private Printer printer;
    private Combine combine;
    private String employee;

    public Office(Room1 room1,Room2 room2,Room3 room3) {
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;

    }

    public Office(Combine combine,Scanner scanner,Printer printer) {
        this.combine = combine;
        this.scanner = scanner;
        this.printer = printer;
    }

    public Office() {

    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public Combine getCombine() {
        return combine;
    }

    public void setCombine(Combine combine) {
        this.combine = combine;
    }

    public abstract void scanner();
}