import java.awt.*;

/**
 * Diamond of width 100px and height of 40px
 * @author Patrick Whitlock
 * @author Aaron Bettencourt
 */
public class Diamond extends Shape {
    private final int width = 100;
    private final int height = 40;

    /**
     * Creates a Diamond object
     * @param color Color in which to draw the shape
     * @param location point at which the shape is located
     * @param label String of text to be drawn on the shape
     */
    public Diamond(Color color, Point location, String label) {
        super(color, location,100,40, label);
    }

    /**
     * Calculates the halfway points of the lines
     * of a rectangle, then connecting those points
     * with lines, resulting in a diamond
     * @param g Graphics in which to draw the shape with
     */
    public void draw(Graphics g) {
        super.draw(g);
        Point top = new Point();
        Point left = new Point();
        Point right = new Point();
        Point bottom = new Point();

        //calculate halfway points
        top.x = super.getLocation().x;
        top.y = super.getLocation().y - height / 2;
        left.x = super.getLocation().x - (width / 2);
        left.y = super.getLocation().y;
        right.x = super.getLocation().x + width / 2;
        right.y = super.getLocation().y;
        bottom.x = super.getLocation().x;
        bottom.y = super.getLocation().y + height / 2;

        g.drawLine(left.x,left.y,top.x,top.y);
        g.drawLine(top.x,top.y,right.x,right.y);
        g.drawLine(right.x,right.y,bottom.x,bottom.y);
        g.drawLine(bottom.x,bottom.y,left.x,left.y);

        int textWidth = g.getFontMetrics().stringWidth(super.getLabel());
        g.setColor(Color.BLACK);
        g.drawString(super.getLabel(),super.getLocation().x-5,super.getLocation().y+3);
    }
}