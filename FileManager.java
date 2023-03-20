import java.io.*;
import java.util.*;

public class FileManager {
    public static ArrayList<CodeBlock> readFile(String filename) {
        ArrayList<CodeBlock> fileContents = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            fileContents = (ArrayList<CodeBlock>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return fileContents;
    }

    public static void writeFile(String filename, ArrayList<CodeBlock> diagramContents) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(diagramContents);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
