import java.awt.*;
import java.awt.event.*;

public class WorkingAreaControlHandler implements MouseListener, MouseMotionListener {

    public WorkingAreaControlHandler(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point pLoc = new Point(e.getX(), e.getY());
        Shape previewShape;
        switch(Repository.getInstance().getSelectedCodeBlock()) {
            case "Start":
                previewShape = new Circle(Color.PINK,pLoc,true,"Start");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "End":
                previewShape = new Circle(Color.PINK,pLoc,false,"End");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Print":
                previewShape = new Parallelogram(Color.PINK,pLoc,"Print");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Loop":
                previewShape = new Diamond(Color.BLUE,pLoc, "Loop");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "If":
                previewShape = new Diamond(Color.BLACK,pLoc,"If");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Instruction":
                previewShape = new Rectangle(Color.ORANGE,pLoc,"Instruction");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Function":
                previewShape = new Rectangle(Color.ORANGE,pLoc,"Function");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Variable":
                previewShape = new Rectangle(Color.ORANGE,pLoc,"Variable");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Connection":
                //
            default:
                System.out.println("Default on WorkingAreaControlHandler");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Repository.getInstance().addPreviewShape();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
