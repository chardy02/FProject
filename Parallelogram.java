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
     * @param text String of text to be drawn on the shape
     */
    public Parallelogram(Color color, Point location, int width, int height, String text) {
        super(color, location, width, height, text);


    /**
     * Draws the shape on screen
     * @param g Graphics object to draw with
     */
    public void draw(Graphics g) {
        super.draw(g);
        parallelogram = new Path2D.Double();
        parallelogram.moveTo(getXCenter(), getYCenter());
        parallelogram.lineTo(getXCenter() + getWidth(), getYCenter());
        parallelogram.lineTo(getXCenter()+(getWidth()*1.5),getYCenter()+getHeight());
        parallelogram.lineTo(getYCenter()+getWidth(),getYCenter()+getHeight());
        parallelogram.closePath();
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(super.getColor());
        g2d.fill(parallelogram);

    }
}
