import java.awt.*;
import java.awt.geom.Path2D;

public class Parallelogram extends Shape {

    private final int width = 100;
    private final int height = 40;
    private Path2D.Double parallelogram;


    public Parallelogram(Color color, Point location, int width, int height, String text) {
        super(color, location, width, height, text);
    }

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