import java.util.ArrayList;

public class Room3 extends Office  implements Combine{




    public Room3() {

    }

    @Override
    public void scanner() {
        System.out.println("Сканер умеет сканировать.\n");
    }

    @Override
    public void Combine(){
        System.out.println("Комбайн печатает лазерной печатью, умеет сканировать и делать копии.\n");
    }

}
