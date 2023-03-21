import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;

/**
 * @author Ashton Alonge
 */
public class Repository extends Observable {
    private static Repository repository;
    private String selectedCodeBlock;
    private String selectedMenuItem, process;
    private ArrayList<CodeBlock> codeBlocks;
    private ArrayList<Line> lines;

    private DiagramApp diagramFrame;

    private Repository(){
        selectedCodeBlock = "Start";
        codeBlocks = new ArrayList<>();
    }

    public static Repository getInstance(){
        if(repository == null) {
            repository = new Repository();
        }
        return repository;
    }

    public void setSelectedCodeBlock(String s){
        selectedCodeBlock = s;
        setChanged();
        notifyObservers(selectedCodeBlock);
    }

    public void selectMenuItem(String s){
        selectedMenuItem = s;
        setChanged();
        notifyObservers(selectedMenuItem);
    }

    public void setCodeBlocks(ArrayList<CodeBlock> codeBlocks) {
        this.codeBlocks = codeBlocks;
    }
    public ArrayList<CodeBlock> getCodeBlocks() {
        if(codeBlocks == null){
            codeBlocks = new ArrayList<>();
        }
        return codeBlocks;
    }

    public void addCodeBlock(CodeBlock codeBlock) {
        if(codeBlocks == null){
            codeBlocks = new ArrayList<>();
        }
        if(codeBlock != null){
            codeBlocks.add(codeBlock);
        }
        setChanged();
        notifyObservers();
    }
    public void setLines(ArrayList<Line> lines) { this.lines = lines; }

    public ArrayList<Line> getLines() {
        if (lines == null) {
            return new ArrayList<>();
        }
        return lines;
    }
    public void addLine(Line l) {
        if(lines == null) {
            lines = new ArrayList<>();
        }
        lines.add(l);
    }
    public void setProcess(String process){
        this.process = process;
    }

    public String getProcess(){
        return process;
    }

    public String getSelectedCodeBlock() {
        return selectedCodeBlock;
    }

    public DiagramApp getDiagramFrame() {
        return diagramFrame;
    }

    public void undo(){
        if(codeBlocks != null && codeBlocks.size() > 0) {
            codeBlocks.remove(codeBlocks.size() - 1);
            setChanged();
            notifyObservers();
        }
    }

    public void clear(){
        codeBlocks.clear();
        setChanged();
        notifyObservers("Board Cleared.");
    }
    public void repaintWorkingArea() {
        setChanged();
        notifyObservers();
    }
}
