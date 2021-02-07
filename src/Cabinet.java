public class Cabinet extends Office{
    private int age;
    private String employee;

    public Cabinet(String cabinet,String employee, int age) {
        super(cabinet);
        this.age = age;
        this.employee = employee;
    }

    public Cabinet() {

    }
}
