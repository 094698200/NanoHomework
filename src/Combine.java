public class Combine extends Devise implements Printable,Scanable{
    @Override
    public void scan() {
        System.out.println("Scan");
    }

    public void copy(){
        System.out.println("Copy");

    }

    @Override
    public void print() {
        System.out.println("Laser print");
    }
}
