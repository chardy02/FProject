import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;

public class Repository extends Observable {

    private static Repository repository;
    private String selectedCodeBlock;
    private String selectedMenuItem, process;
    private ArrayList<Shape> shapes;
    private Point previewShapeP1;
    private Point previewShapeP2;
    private Shape previewShape;

    private JFrame diagramFrame;
    private WorkingArea workingArea;

    private Repository(){
        selectedCodeBlock = "Start";
        shapes = new ArrayList<>();
    }

    public static Repository getInstance(){
        if(repository == null)
            repository = new Repository();
        return repository;
    }

    public void setDiagramFrame(JFrame _frame) {
        diagramFrame = _frame;
    }
    public JFrame getDiagramFrame() { return diagramFrame; }
    public void setWorkingArea(WorkingArea shapeArea) {
        workingArea = shapeArea;
    }
    public WorkingArea getWorkingArea() {
        return workingArea;
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

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    public void setShapes(ArrayList<Shape> newShapes) {
        shapes = newShapes;
    }
    public void addPreviewShape() {
        if(previewShape != null) shapes.add(previewShape);
        previewShape = null;
        setChanged();
        notifyObservers();
    }

    public void setProcess(String process){
        this.process = process;
    }

    public String getProcess(){
        return process;
    }

    public Point getPreviewShapeP1() {
        return previewShapeP1;
    }

    public Point getPreviewShapeP2() {
        return previewShapeP2;
    }

    public Shape getPreviewShape() {
        return previewShape;
    }

    public String getSelectedCodeBlock() {
        return selectedCodeBlock;
    }

    public void setPreviewShapeP1(Point previewShapeP1) {
        this.previewShapeP1 = previewShapeP1;
        setChanged();
        notifyObservers(selectedCodeBlock);
    }

    public void setPreviewShapeP2(Point previewShapeP2) {
        this.previewShapeP2 = previewShapeP2;
        setChanged();
        notifyObservers();
    }

    public void setPreviewShape(Shape previewShape) {
        this.previewShape = previewShape;
        setChanged();
        notifyObservers();

    }

    public void undo(){
        if(shapes.size() > 0) {
            shapes.remove(shapes.size() - 1);
            setChanged();
            notifyObservers();
        }
    }

    public void clear(){
        shapes.clear();
        setChanged();
        notifyObservers("Board Cleared.");
    }
}
