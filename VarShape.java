import java.awt.*;

public class VarShape extends Shape {

    /**
     * @author alexbanham
     * Creates a VarShape object
     * @param color Color in which to draw the shape
     * @param xPosCenter x coordinate of center of shape
     * @param yPosCenter y coordinate of center of shape
     * @param width the width of the shape
     * @param height the hiegh of the shape
     */
    public VarShape(int xPosCenter, int yPosCenter, int width, int height, Color color) {
        super(xPosCenter, yPosCenter, width, height, color);
    }

    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getXCenter() - (getWidth() / 4), getYCenter() - getHeight() / 2, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawLine(getXCenter() - (getWidth() / 8), getYCenter() + (getHeight()/2), getXCenter() - (getWidth() / 8), getYCenter() - (getHeight()/2));
        g.drawLine(getXCenter() - getWidth() / 4, getYCenter(), (int) (getXCenter() + getWidth() / 1.33), getYCenter());
    }
}