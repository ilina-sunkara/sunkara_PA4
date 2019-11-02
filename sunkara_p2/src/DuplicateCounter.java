import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DuplicateCounter {
    int wordCounter = 0;


    public void count(FileInputStream dataFile) throws IOException{
        Scanner inFS = new Scanner(dataFile);
        ArrayList<String> allWords = new ArrayList<String>();
        while (inFS.hasNext()) {
            String uniqueWord = (inFS.next().toLowerCase());
            if (allWords.contains(uniqueWord)) {
                wordCounter++;
            }
        }
        try {
            if (dataFile != null) {
                System.out.println("Closing file.");
                dataFile.close();
            }
        } catch (IOException closeExcpt) {
            System.out.println("Error closing file: " + closeExcpt.getMessage());
        } finally {
            dataFile.close();
        }
    }

    public void write(FileOutputStream outputFile) throws IOException{
        PrintWriter outFS = new PrintWriter(outputFile);
        outFS.print(wordCounter);
        try {
            if (outputFile != null) {
                System.out.println("Closing file.");
                outputFile.close();
            }
        } catch (IOException closeExcpt) {
            System.out.println("Error closing file: " + closeExcpt.getMessage());
        } finally {
            outputFile.close();
        }
    }
}
