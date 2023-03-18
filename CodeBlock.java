import java.awt.*;
import java.util.ArrayList;

public abstract class CodeBlock {
    private Drawable shape;
    private ArrayList<CodeBlock> inboundCodeBlocks;
    private ArrayList<CodeBlock> outboundCodeBlocks;
    private int maxInboundCount;
    private int maxOutboundCount;

    public CodeBlock(Drawable shape, ArrayList<CodeBlock> inboundCodeBlocks, ArrayList<CodeBlock> outboundCodeBlocks) {
        this.shape = shape;
        this.inboundCodeBlocks = inboundCodeBlocks;
        this.outboundCodeBlocks = outboundCodeBlocks;
    }

    public void setCenter(int x, int y) {
        shape.setCenter(x, y);
    }

    public Drawable getShape() {
        return this.shape;
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
}
