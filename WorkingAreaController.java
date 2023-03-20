import java.awt.event.*;

public class WorkingAreaController implements MouseListener, MouseMotionListener{
    public WorkingAreaController() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch(Repository.getInstance().getMode()) {
            case "Start":
            case "Stop":
            case "Print":
            case "Loop":
            case "IF":
            case "Instruction":
            case "VariableDeclaration":
            case "FunctionCall":
            case "Line":
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

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
