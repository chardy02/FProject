import java.awt.*;

public class Circle extends Shape {
    private final int radius = 50;
    private boolean isFilled;

    public Circle(Color color, Point location, boolean isFilled, String label) {
        super(color, new Point(location.x, location.y),100,100, label);
        this.isFilled = isFilled;
    }

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