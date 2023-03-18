import java.awt.*;

public abstract class CodeBlock {
    private Drawable shape;

    public CodeBlock(Drawable shape) {
        this.shape = shape;
    }

    public void setCenter(int x, int y) {
        shape.setCenter(x, y);
    }

    public Drawable getShape() {
        return this.shape;
    }

}
