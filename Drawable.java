import java.awt.*;

public interface Drawable {
    public void draw(Graphics g);
    public int getXCenter();
    public int getYCenter();

    public void setXCenter(int xCenter);
    public void setYCenter(int yCenter);

    public Color getColor();
}
