import java.awt.*;

public class PerpendicularLineDecorator extends ShapeDecorator {
    public PerpendicularLineDecorator(Shape innerShape) {
        super(innerShape);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.BLACK);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(getXCenter() - width / 2, getYCenter() - height / 3,
                getXCenter() + width / 2, getYCenter() - height / 3);
        g.drawLine(getXCenter() - width / 3, getYCenter() + height / 2,
                getXCenter() - width / 3, getYCenter() - height / 2);
    }
}
