public class LessonOneExOne {
    public static void main(String[] args) {
        int number = 9;
        if(number > 0){
            number = number + 1;
        }
        else if(number < 0){
            number = number - 2;
        }
        else if(number == 0){
            number = 10;
        }else{
            System.out.println(number);
        }
    }
}
