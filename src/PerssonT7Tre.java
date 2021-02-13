import java.io.Console;

public class PerssonT7Tre {
    public static void main(String[] args) {
        String in = "Паблито, а профит-то в чём, если нужно получить количество конкретного символа, то ничего шустрее тупого перебора с проверкой не придумать.";
        String c = "о"; // букву, которую надо посчитать
        int len = in.length();
        int newlen = in.replaceAll(c,"").length();
        System.out.println("всего букв - " + (len - newlen));
    }
}