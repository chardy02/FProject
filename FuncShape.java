import java.awt.*;

public class FuncShape extends Shape {

    /**
     * @author alexbanham
     * Creates a FuncShape object
     * @param color Color in which to draw the shape
     * @param xPosCenter x coordinate of center of shape
     * @param yPosCenter y coordinate of center of shape
     * @param width the width of the shape
     * @param height the height of the shape
     */
    public FuncShape(int xPosCenter, int yPosCenter, int width, int height, Color color) {
        super(xPosCenter, yPosCenter, width, height, color);
    }

    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getXCenter() - (getWidth() / 4), getYCenter() - getHeight() / 2, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawLine((int) (getXCenter() - (getWidth() / 13.5)), getYCenter() + (getHeight()/2), (int) (getXCenter() - (getWidth() / 13.5)), getYCenter() - (getHeight()/2));
        g.drawLine((int) (getXCenter() + (getWidth() / 1.75)), getYCenter() + (getHeight()/2), (int) (getXCenter() + (getWidth() / 1.75)), getYCenter() - (getHeight()/2));
    }
}