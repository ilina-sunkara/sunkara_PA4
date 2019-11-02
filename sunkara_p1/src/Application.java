import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Application{
    public static void main(String[] args) throws IOException{
        FileInputStream dataFile = new FileInputStream("problem1.txt");
        FileOutputStream outputFile = new FileOutputStream("unique_words.txt");


        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove(dataFile);
        duplicateRemover.write(outputFile);
    }
}
