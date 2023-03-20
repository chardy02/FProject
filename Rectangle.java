import java.awt.*;

/**
 * Rectangle of width 100px, height of 40px
 * @author Patrick Whitlock
 * @author Aaron Bettencourt
 * @author Ashton Alonge
 */
public class Rectangle extends Shape {
    private final int width = 100;
    private final int height = 40;

    /**
     * Creates a rectangle object
     * @param color Color in which to draw the shape
     * @param location point at which the shape is located
     * @param label String of text to be drawn on the shape
     */
    public Rectangle(Color color, Point location, String label) {
        super(color, location,100,40, label);
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.fillRect(super.getLocation().x - width / 2,super.getLocation().y - height / 2,width,height);

        //int textWidth = g.getFontMetrics().stringWidth(super.getLabel());
        g.setColor(Color.BLACK);
        g.drawString(super.getLabel(),super.getLocation().x-15,super.getLocation().y+5);
    }
}
