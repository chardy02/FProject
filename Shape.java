import java.awt.*;

public abstract class Shape implements Drawable{
    private int xPosCenter;
    private int yPosCenter;
    private int width;
    private int height;
    private Color color;

    public Shape(int xPosCenter, int yPosCenter, int width, int height, Color color){
        if(color == null){
            throw new NullPointerException();
        }
        if(width < 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        if(height < 0){
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        this.xPosCenter = xPosCenter;
        this.yPosCenter = yPosCenter;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public boolean isInbounds(int x, int y){
        return x <= xPosCenter + width/2 && x >= xPosCenter -width/2
        && y < yPosCenter + height/2 && yPosCenter > yPosCenter - height/2;
    }

    public int getXCenter(){
        return xPosCenter;
    }

    public void setXCenter(int xPosCenter){
        this.xPosCenter = xPosCenter;
    }

    public int getYCenter(){
        return yPosCenter;
    }
    public void setYCenter(int yPosCenter){
        this.yPosCenter = yPosCenter;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Color getColor() {
        return color;
    }
}