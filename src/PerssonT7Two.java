import java.util.Locale;

public class PerssonT7Two {
    public static void main(String[] args) {
        String str = "Привет, java-программист!";

        int indexM = str.indexOf("м"); // Нахождение символа в строке
        int indexJava = str.indexOf("java"); // Нахождение слова в строке

        if(indexM == - 1) {
            System.out.println("Символ \"м\" не найден.");
        } else {
            System.out.println("Символ \"м\" найден в индексе " + indexM);
        }

        if(indexJava == - 1) {
            System.out.println("Слово \"java\" не найдено.");
        } else {
            System.out.println("Слово \"java\" найдено в индексе " + indexJava);
        }
    }
}
