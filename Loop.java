import java.awt.*;

public class Loop extends CodeBlock {
    private Drawable shape;

    public Loop(Drawable shape, int maxInboundCount, int maxOutboundCount) {
        super(shape, new ArrayList<CodeBlock>(), new ArrayList<CodeBlock>(), maxInboundCount, maxOutboundCount);
        this.shape = shape;
    }

    public void setCenter(int x, int y) {
        shape.setCenter(x, y);
    }

    public Drawable getShape() {
        return this.shape;
    }
}
