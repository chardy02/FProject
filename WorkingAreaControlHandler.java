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
            case "Process":
                previewShape = new Rectangle(Color.ORANGE,pLoc,Repository.getInstance().getProcess());
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Decision":
                previewShape = new Diamond(Color.BLUE,pLoc, "If");
                Repository.getInstance().setPreviewShape(previewShape);
                break;
            case "Line":
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
