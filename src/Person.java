public abstract class Person {

    private String lastName;
    private  String firstName;
    private String patronymic;
    private String printer;
    private String scanner;

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Person(String lastName,String firstName,String patronymic){

        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public void display() {

        System.out.println("lastName ! " + lastName + "firstName ! " + firstName + "patronymic !" + patronymic);
    }
    public void work(){
        System.out.println("Printer !" + printer + "Scanner !" + scanner + " Printer !" + printer);
    }
}