import java.awt.*;

public class DotDecorator extends DrawableDecorator {
    Drawable drawable;

    public DotDecorator(Drawable innerDrawable) {
        super(innerDrawable);
        drawable = innerDrawable;
    }
    @Override
    public void draw(Graphics g) {
        Shape s = (Shape) super.getInnerDrawable();
        g.fillOval(s.getXCenter(), s.getYCenter(), 4, 4);
    }

    @Override
    public int getWidth() {
        return drawable.getWidth();
    }

    @Override
    public int getHeight() {
        return drawable.getHeight();
    }
}