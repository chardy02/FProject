import java.awt.*;

/**
 * Rectangle of width 100px, height of 40px
 * @author Patrick Whitlock
 * @author Ashton Alonge
 */
public class Rectangle extends Shape {

    /**
     * Creates a rectangle object
     * @param color Color in which to draw the shape
     */
    public Rectangle(int xPosCenter, int yPosCenter, int width, int height, Color color) {
        super(xPosCenter, yPosCenter,width,height, color);
    }

    /**
     * Draws the shape on screen
     * @param g   An instance of type Graphics to draw a representation
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getXCenter() - getWidth() / 2,getYCenter() - getHeight() / 2, getWidth(), getHeight());
    }
}
