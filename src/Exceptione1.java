import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.EOFException;
public class Exceptione1 {
        public static void main (String[]args) throws EOFException, FileNotFoundException {
            if (System.currentTimeMillis() % 2 == 0) {
                try {
                    throw new EOFException();
                } catch (EOFException e) {
                    e.printStackTrace();
                }
            } else {
                throw new FileNotFoundException();
            }
        }
    }
