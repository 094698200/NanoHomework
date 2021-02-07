public class Printer extends Office{

    public Printer(String cabinet) {
        super(cabinet);
    }

    public Printer() {

    }

    public void enabled(){
        System.out.println("Принтер печатает");
    }
}
