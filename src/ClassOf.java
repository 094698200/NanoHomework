import java.util.ArrayList;

public class ClassOf {


    public static void main(String[] args) {
     Room1 room1 = new Room1();
     room1.Printer();

     Room2 room2 = new Room2();
     room2.Scanner();

     Room3 room3 = new Room3();
     room3.Combine();

     Employee arra = new Employee("Arra","Avetisyan","Avetisi","Room1");
     arra.display();
     arra.work();

     Employee marat = new Employee("Marat","Zargaryan","Kareni","Room1");
     marat.display();
     marat.work();

     Employee anna = new Employee("Anna","Matevosyan","Sahaki","Room2");
     anna.display();
     anna.work();

     Employee vera = new Employee("Vera","Avetisyan","Sisaki","Room2");
     vera.display();
     vera.work();

     Employee hayk = new Employee("Hayk","Aharonyan","Zaveni","Room2");
     hayk.display();
     hayk.work();

     Employee alen = new Employee("Alen","Karapetyan","Avetisi","Room2");
     alen.display();
     alen.work();

     Employee arsen = new Employee("Arsen","Hovhannisyan","Avetisi","Room3");
     arsen.display();
     arsen.work();

     Employee gagik = new Employee("Gagik","Avetisyan","Qeropi","Room3");
     gagik.display();
     gagik.work();
    }
}