import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class CodeBlock implements Serializable {
    private Shape shape;

//    private ArrayList<Line> inboundLines;
//    private ArrayList<Line> outboundLines;

    private ArrayList<CodeBlock> inboundCodeBlocks;
    private ArrayList<CodeBlock> outboundCodeBlocks;
    private int maxInboundCount;
    private int maxOutboundCount;

    public CodeBlock(Shape shape, int maxInboundCount, int maxOutboundCount) {
        this.shape = shape;
        this.inboundCodeBlocks = new ArrayList<>();
        this.outboundCodeBlocks = new ArrayList<>();
        this.maxInboundCount = maxInboundCount;
        this.maxOutboundCount = maxOutboundCount;
    }
    public Shape getShape() {
        return shape;
    }

    public void setXCenter(int x) {
        shape.setXCenter(x);
    }

    public void setYCenter(int y) {
        shape.setYCenter(y);
    }

    public int getXCenter() {
        return shape.getXCenter();
    }


    public int getYCenter() {
        return shape.getYCenter();
    }

    public boolean canAddIn() {
        return inboundCodeBlocks.size() < maxInboundCount;
    }
    public boolean canAddOut() {
        System.out.println(outboundCodeBlocks.size());
        return outboundCodeBlocks.size() < maxOutboundCount;
    }

    public boolean addToInbound(CodeBlock block) {
        if (inboundCodeBlocks.size() < maxInboundCount) {
            return inboundCodeBlocks.add(block);
        } else {
            return false;
        }
    }
    public boolean addToOutbound(CodeBlock block) {
        if (outboundCodeBlocks.size() < maxOutboundCount) {
            return outboundCodeBlocks.add(block);
        } else {
            return false;
        }
    }

    public ArrayList<CodeBlock> getInboundCodeBlocks() {
        return this.inboundCodeBlocks;
    }

    public void setInboundCodeBlocks(ArrayList<CodeBlock> inboundCodeBlocks) {
        this.inboundCodeBlocks = inboundCodeBlocks;
    }

    public ArrayList<CodeBlock> getOutboundCodeBlocks() {
        return this.outboundCodeBlocks;
    }

    public void setOutboundCodeBlocks(ArrayList<CodeBlock> outboundCodeBlocks) {
        this.outboundCodeBlocks = outboundCodeBlocks;
    }

    public int getMaxInboundCount() {
        return this.maxInboundCount;
    }

    public void setMaxInboundCount(int maxInboundCount) {
        this.maxInboundCount = maxInboundCount;
    }

    public int getMaxOutboundCount() {
        return this.maxOutboundCount;
    }

    public void setMaxOutboundCount(int maxOutboundCount) {
        this.maxOutboundCount = maxOutboundCount;
    }

    public void draw(Graphics g){
        shape.draw(g);
    }

    public boolean isInBounds(int x, int y) {
        return shape.isInBounds(x, y);
    }

    public int getHeight(){
        return shape.getHeight();
    }
}
