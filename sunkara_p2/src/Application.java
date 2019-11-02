import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        FileInputStream dataFile = new FileInputStream("problem2.txt");
        FileOutputStream outputFile = new FileOutputStream("unique_word_counts.txt");


        DuplicateCounter duplicateCounter = new DuplicateCounter();
        duplicateCounter.count(dataFile);
        duplicateCounter.write(outputFile);
    }
}
