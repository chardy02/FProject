import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class WorkingAreaControlHandler implements MouseListener, MouseMotionListener {
    private boolean drawingLine = false;
    private CodeBlock dragging = null;
    private Point dragOffset = null;
    private CodeBlock firstClicked = null;

    public WorkingAreaControlHandler(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        BlockFactory blockFactory = new BlockFactory();
        String blockType = Repository.getInstance().getSelectedCodeBlock();
        if (blockType.equals("Connection")) {
            for(CodeBlock block : Repository.getInstance().getCodeBlocks()) {
                Drawable s = block.getShape();
                if (s.isInBounds(e.getX(), e.getY())) {
                    if (drawingLine) {
                        if(block.addToInbound(firstClicked) && firstClicked.addToOutbound(block)) {
                            Repository.getInstance().addLine(new Line(block, firstClicked));
                            firstClicked = null;
                            break;
                        }
                    }
                    firstClicked = block;
                    drawingLine = true;
                    break;
                }
            }
        }
        else {
            for(CodeBlock block : Repository.getInstance().getCodeBlocks()) {
                Drawable s = block.getShape();
                if(s.isInBounds(e.getX(), e.getY())) {
                    dragging = block;
//                    dragOffset = new Point(e.getX() - s.getXCenter(), e.getY() - s.getYCenter());
                }
            }
            if(dragging == null) {
                Repository.getInstance().addCodeBlock(blockFactory.makeBlock(blockType, e.getX(), e.getY()));
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        dragging = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(dragging != null) {
//            System.out.println("X: " + e.getX() + ", Y: " + e.getY());
            dragging.setXCenter(e.getX() /*- dragOffset.x*/);
            dragging.setYCenter(e.getY() /*- dragOffset.y*/);
            Repository.getInstance().repaintWorkingArea();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(drawingLine) {
            ArrayList<Line> lines = Repository.getInstance().getLines();
//            lines.get(lines.size() - 1).follow(new Point(e.getX(), e.getY()));
//            drawingLine.follow(new Point(e.getX(), e.getY()));
            Repository.getInstance().repaintWorkingArea();
        }
    }
}
