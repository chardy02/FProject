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
        BlockFactory blockFactory = new BlockFactory();
        String blockType = Repository.getInstance().getSelectedCodeBlock();
        Repository.getInstance().addCodeBlock(blockFactory.makeBlock(blockType, e.getX(), e.getY()));
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
