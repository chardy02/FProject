import java.awt.*;

public class Rectangle extends Shape {
    private final int width = 100;
    private final int height = 40;

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
