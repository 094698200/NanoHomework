

public  class Employee extends Person {

    private String offise;


    public Employee(String lastName, String firstName, String patronymic, String offise) {
        super(lastName, firstName, patronymic);
        this.offise = offise;
    }

    public void work() {
        System.out.printf("%s works in %s \n", getLastName(), offise);
    }

    @Override
    public void display(){

        super.display();
        System.out.printf("Works in %s \n", offise);
    }
    }

