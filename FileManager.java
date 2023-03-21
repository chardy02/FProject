import java.io.*;
import java.util.*;

public class FileManager {
    public static void readFile(String filename) {
        ArrayList<CodeBlock> blocks = new ArrayList<>();
        ArrayList<Line> lines = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename + ".blocks");
            ObjectInputStream ois = new ObjectInputStream(fis);
            blocks = (ArrayList<CodeBlock>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        try {
            FileInputStream fis = new FileInputStream(filename + ".lines");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lines = (ArrayList<Line>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        Repository.getInstance().setCodeBlocks(blocks);
        Repository.getInstance().setLines(lines);
    }

    public static void writeFile(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename + ".blocks");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(Repository.getInstance().getCodeBlocks());
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing to file: " + e.getMessage());
        }
        try {
            FileOutputStream fos = new FileOutputStream(filename + ".lines");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(Repository.getInstance().getLines());
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing to file: " + e.getMessage());
        }

    }
}
