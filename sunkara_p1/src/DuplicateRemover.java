import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DuplicateRemover {
    ArrayList<String> uniqueWords = new ArrayList<String>();


    public void remove(FileInputStream dataFile) throws IOException{
        Scanner inFS = new Scanner(dataFile);
        while (inFS.hasNext()) {
            String uniqueWord = (inFS.next().toLowerCase());
            if (!uniqueWords.contains(uniqueWord)) {
                uniqueWords.add(uniqueWord);
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
        for(int i=0; i<uniqueWords.size(); i++){
            outFS.print(uniqueWords.get(i));
        }
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
