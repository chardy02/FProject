import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class WorkingAreaControlHandler implements MouseListener, MouseMotionListener, Observer {
    private boolean drawingLine = false;
    private CodeBlock dragging = null;
    private Point dragOffset = null;
    private CodeBlock firstClicked = null;

    private String selectedBlock = null;

    private Dictionary codeBlocks;

    public WorkingAreaControlHandler(){
        codeBlocks = new Hashtable();
        codeBlocks.put("Start", 0);
        codeBlocks.put("End", 0);
        codeBlocks.put("Print", 0);
        codeBlocks.put("Loop", 0);
        codeBlocks.put("If", 0);
        codeBlocks.put("Instruction", 0);
        codeBlocks.put("Function", 0);
        codeBlocks.put("Variable", 0);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        BlockFactory blockFactory = new BlockFactory();
        String blockType = Repository.getInstance().getSelectedCodeBlock();
        // Drawing lines between two CodeBlocks
        if (blockType.equals("Connection")) {
            // Check every code block, if mouse is inside...
            for(CodeBlock block : Repository.getInstance().getCodeBlocks()) {
                if (block.isInBounds(e.getX(), e.getY())) {
                    // If we are already drawing a connection
                    if(drawingLine) {
                        // Can we add in/out connections for each CodeBlock, and we aren't connecting with itself
                        System.out.println(firstClicked);
                        System.out.println(block);
                        if(block.canAddIn() && firstClicked.canAddOut() && !block.equals(firstClicked)) {
                            ArrayList<Line> lines = Repository.getInstance().getLines();
                            lines.get(lines.size() - 1).update(block);
                            firstClicked.addToOutbound(block);
                            block.addToInbound(firstClicked);
                            firstClicked = null;
                            drawingLine = false;
                            Repository.getInstance().repaintWorkingArea();
                        }
                    }
                    else {
                        Repository.getInstance().phantomLine(block, new Point(e.getX(), e.getY()));
                        firstClicked = block;
                        drawingLine = true;
                    }
                    break;
                }
            }
//                if(block.canAddIn() && firstClicked.canAddOut() && !block.equals(firstClicked)) {
//                    Repository.getInstance().addLine(new Line(firstClicked, block));
//                    firstClicked = null;
//                    drawingLine = false;
//                    Repository.getInstance().repaintWorkingArea();
//                    break;
//                }
            // If we are drawing a line...
//            if (drawingLine) {
//               for(CodeBlock block : Repository.getInstance().getCodeBlocks()) {
//                   if(block.canAddIn() && firstClicked.canAddOut() && !block.equals(firstClicked)) {
//                       Repository.getInstance().addLine(new Line(firstClicked, block));
//                       firstClicked = null;
//                       drawingLine = false;
//                       Repository.getInstance().repaintWorkingArea();
//                       break;
//                   }
//               }
//            }
//
//            for(CodeBlock block : Repository.getInstance().getCodeBlocks()) {
//                if (block.isInBounds(e.getX(), e.getY())) {
//                    if (drawingLine) {
//                        if(block.canAddIn() && firstClicked.canAddOut() && !block.equals(firstClicked)) {
//                            Repository.getInstance().addLine(new Line(firstClicked, block));
//                            firstClicked = null;
//                            drawingLine = false;
//                            Repository.getInstance().repaintWorkingArea();
//                            break;
//                        }
//                    }
//                    else {
//
//                    }
//                    firstClicked = block;
//                    drawingLine = true;
//                    break;
//                }
//            }
        }
        else {
            for(CodeBlock block : Repository.getInstance().getCodeBlocks()) {
                if(block.isInBounds(e.getX(), e.getY())) {
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
            dragging.setXCenter(e.getX() /*- dragOffset.x*/);
            dragging.setYCenter(e.getY() /*- dragOffset.y*/);
            Repository.getInstance().repaintWorkingArea();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(drawingLine) {
            ArrayList<Line> lines = Repository.getInstance().getLines();
            lines.get(lines.size() - 1).follow(new Point(e.getX(), e.getY()));
            Repository.getInstance().repaintWorkingArea();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        String status = (String) arg;

//        System.out.println("Selected block:" + selectedBlock);
        if(status != null) {
            if(status == "Board Cleared.") {
                drawingLine = false;
                firstClicked = null;
            }
            if(codeBlocks.get(status) != null && selectedBlock == "Connection") {
                selectedBlock = status;
                drawingLine = false;
                firstClicked = null;
                Repository.getInstance().removePhantomLine();
            }
            System.out.println("Status:" + status);
        }
    }
}
