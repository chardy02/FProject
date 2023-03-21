import java.awt.*;
import java.io.Serializable;

public interface Drawable extends Serializable {
    public void draw(Graphics g);
    public int getXCenter();
    public int getYCenter();

    public int getWidth();


    public int getHeight();

    public void setXCenter(int xCenter);
    public void setYCenter(int yCenter);
    public Color getColor();
    public boolean isInBounds(int x, int y);
}
