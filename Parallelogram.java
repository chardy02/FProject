import java.awt.*;
import java.awt.geom.Path2D;
/**
 * Parallelogram that is 100px wide, 40px high
 * @author Patrick Whitlock
 * @author Aaron Bettencourt
 * @author Ashton Alonge
 */
public class Parallelogram extends Shape {

    private Path2D.Double parallelogram;

    /**
     * Creates a parallelogram object
     * @param color Color in which to draw the shape
     * @param location point at which the shape is located
     * @param text String of text to be drawn on the shape
     */
    public Parallelogram(int xPosCenter, int yPosCenter, int width, int height, Color color) {
        super(xPosCenter, yPosCenter,width,height, color);
    }

    /**
     * Draws the shape on screen
     * @param g Graphics object to draw with
     */
    public void draw(Graphics g) {
        parallelogram = new Path2D.Double();
        parallelogram.moveTo(getXCenter(), getYCenter());
        parallelogram.lineTo(getXCenter() + getWidth(), getYCenter());
        parallelogram.lineTo(getXCenter()+(getWidth()*1.25),getYCenter()+getHeight());
        parallelogram.lineTo(getXCenter()+(getWidth()*.25),getYCenter()+getHeight());
        parallelogram.closePath();
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(super.getColor());
        g2d.fill(parallelogram);
    }
}