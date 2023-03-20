import java.awt.*;

/**
 * Diamond of width 100px and height of 40px
 * @author Patrick Whitlock
 * @author Aaron Bettencourt
 */
public class Diamond extends Shape {

    /**
     * Creates a Diamond object
     * @param color Color in which to draw the shape
     */

    public Diamond(int xPosCenter, int yPosCenter, int width, int height, Color color) {
        super(xPosCenter, yPosCenter,width,height, color);
    }

    /**
     * Calculates the halfway points of the lines
     * of a rectangle, then connecting those points
     * with lines, resulting in a diamond
     * @param g Graphics in which to draw the shape with
     */
    public void draw(Graphics g) {
        Point top = new Point();
        Point left = new Point();
        Point right = new Point();
        Point bottom = new Point();

        //calculate halfway points
        top.x = getXCenter();
        top.y = getYCenter() - getHeight() / 2;
        left.x = getXCenter() - (getWidth() / 2);
        left.y = getYCenter();
        right.x = getXCenter() + getWidth() / 2;
        right.y = getYCenter();
        bottom.x = getXCenter();
        bottom.y = getYCenter() + getHeight() / 2;

        g.setColor(getColor());
        g.drawLine(left.x,left.y,top.x,top.y);
        g.drawLine(top.x,top.y,right.x,right.y);
        g.drawLine(right.x,right.y,bottom.x,bottom.y);
        g.drawLine(bottom.x,bottom.y,left.x,left.y);
    }
}