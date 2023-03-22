import java.awt.*;

public class DotDecorator extends ShapeDecorator {

    public DotDecorator(Shape innerShape) {
        super(innerShape);
    }
    @Override
    public void draw(Graphics g) {
        super.draw(g);
        int radius = getWidth() / 2 - 10;
        g.fillOval(getXCenter() - radius, getYCenter() - radius,
                radius * 2, radius * 2);
    }
}