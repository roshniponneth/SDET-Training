import java.io.File;
import java.io.IOException;

public class LineIterator {
    public static void main(String[] args) {
        try {
            usingLineIterator();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingLineIterator() throws IOException {
        //get the file object
        File file = FileUtils.getFile("input.txt");

        try(LineIterator lineIterator = FileUtils.lineIterator(file)) {
            System.out.println("Contents of input.txt");
            while(lineIterator.hasNext()) {
                System.out.println(lineIterator.next());
            }
        }
    }
}
}
