import java.io.File;
import java.io.FilenameFilter;

public class File2 {
    public static void main(String[] args) {
        File folder = new File("F://Windows");

        String[] files = folder.list(new FilenameFilter() {

            @Override
            public boolean accept(File folder, String name) {
                return name.endsWith(".exe");
            }

        });

        for ( String fileName : files ) {
            System.out.println("File: " + fileName);
        }
    }
}
