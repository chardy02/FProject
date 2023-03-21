import java.awt.*;

public class DotDecorator extends DrawableDecorator {
    public DotDecorator(Drawable innerDrawable) {
        super(innerDrawable);
    }
    @Override
    public void draw(Graphics g) {
        Shape s = (Shape) super.getInnerDrawable();
        g.fillOval(s.getXCenter(), s.getYCenter(), 4, 4);
    }
}