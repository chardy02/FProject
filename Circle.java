import java.awt.*;

/**
 * Circle with a radius of 50px
 * @author Patrick Whitlock
 * @author Ashton Alonge
 * @author Aaron Bettencourt
 */
public class Circle extends Shape {
    private final int radius = 50;
    private boolean isFilled;

    /**
     * Creates a new Circle object
     * @param color Color in which to draw the shape
     * @param location point at which the shape is located
     * @param isFilled boolean of whether the circle is filled or just an outline
     * @param label String of text to be drawn on the shape
     */
    public Circle(Color color, Point location, boolean isFilled, String label) {
        super(color, new Point(location.x, location.y),100,100, label);
        this.isFilled = isFilled;
    }

    /**
     * Draws the shape on screen
     * @param g Graphics object to draw with
     */
    @Override
    public void draw(Graphics g) {
        super.draw(g);
        if(isFilled)
            g.fillOval(super.getLocation().x - radius, super.getLocation().y - radius,radius *2, radius *2);
        else g.drawOval(super.getLocation().x - radius,super.getLocation().y - radius ,radius * 2, radius * 2);

        int textWidth = g.getFontMetrics().stringWidth(super.getLabel());
        g.setColor(Color.BLACK);
        g.drawString(super.getLabel(),super.getLocation().x-16,
                super.getLocation().y+5);
    }
}