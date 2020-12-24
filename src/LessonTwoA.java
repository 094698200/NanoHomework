import Client.Client;

import java.sql.ClientInfoStatus;

import static sun.rmi.transport.TransportConstants.Call;

public class LessonTwoA {
    private static String name;
    private String address;
    private Staff[]staff = new Staff[10];
    private String customers;



    public static  void main(String[] args) {
        Staff staff = new Staff();
        Client client = new Client();
        System.out.println(name + staff);

    }
    public static class Staff{
        String name ;
        String lastname;
        String car;
        String address;

        void canWork(){
            return;
        }
        void  canTalk(){
            return;
        }
        void takeOrders(){
        return ;
        }
        class Clients{
            String name;
            String lastname;
            String patronymic;
            String profession;
            String hobby;

        }
        void  canCall(){
            return;
        }
        void canWrite(){
             return;
        }
    }
}


