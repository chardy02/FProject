import java.io.*;
import java.util.*;

public class FileManager {
    public static void readFile(String filename) {
        ArrayList<CodeBlock> blocks = new ArrayList<>();
        ArrayList<Line> lines = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename + ".diag");
            ObjectInputStream ois = new ObjectInputStream(fis);
            blocks = (ArrayList<CodeBlock>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        for(CodeBlock b : blocks) {
            for(CodeBlock out : b.getOutboundCodeBlocks()) {
                Repository.getInstance().addLine(new Line(b, out));
            }
        }
        Repository.getInstance().setCodeBlocks(blocks);
    }

    public static void writeFile(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename + ".diag");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(Repository.getInstance().getCodeBlocks());
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
