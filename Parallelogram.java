import java.awt.*;
import java.awt.geom.Path2D;
/**
 * Parallelogram that is 100px wide, 40px high
 * @author Patrick Whitlock
 * @author Aaron Bettencourt
 * @author Ashton Alonge
 */
public class Parallelogram extends Shape {

    private final int width = 100;
    private final int height = 40;
    private Path2D.Double parallelogram;

    /**
     * Creates a parallelogram object
     * @param color Color in which to draw the shape
     * @param location point at which the shape is located
     * @param width how many pixels wide the shape is
     * @param height how many pixels high the shape is
     * @param text String of text to be drawn on the shape
     */
    public Parallelogram(Color color, Point location, int width, int height, String text) {
        super(color, location, width, height, text);
    }

    /**
     * Draws the shape on screen
     * @param g Graphics object to draw with
     */
    public void draw(Graphics g) {
        super.draw(g);
        parallelogram = new Path2D.Double();
        parallelogram.moveTo(getLocation().x,getLocation().y);
        parallelogram.lineTo(getLocation().x+width,getLocation().y);
        parallelogram.lineTo(getLocation().x+(width*1.5),getLocation().y+height);
        parallelogram.lineTo(getLocation().y+width,getLocation().y+height);
        parallelogram.closePath();
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(super.getColor());
        g2d.fill(parallelogram);
    }
}