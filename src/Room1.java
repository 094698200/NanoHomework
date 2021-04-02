import java.util.ArrayList;

 public class Room1 extends Office implements Printer{


    private String lastName;
    private String firstName;
    private String patronymic;


    public Room1(Room1 room1, Room2 room2, Room3 room3) {
        super(room1, room2, room3);
    }

    public Room1() {
        super();
    }

     @Override
     public void scanner() {
         System.out.println("Сканер умеет сканировать.\n");
     }

     @Override
    public void Printer(){
      System.out.println("Принтер может печатать струйным методом\n");
  }

     public void display() {

       System.out.println("lastName ! " + lastName + "firstName ! " + firstName + "patronymic !" + patronymic);
     }
}


