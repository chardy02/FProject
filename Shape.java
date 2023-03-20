import java.awt.*;
import java.io.Serializable;

public class Shape implements Serializable {
    private Color color;
    private Point location;
    private final int width;
    private final int height;
    private TextField textField;

    public Shape(Color color, Point location, int width, int height, String text) {
        if(color == null){
            throw new NullPointerException();
        }
        if(width < 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        if(height < 0){
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        this.color = color;
        this.location = location;
        this.width = width;
        this.height = height;
        this.textField = new TextField(text);
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(4));
        g.setFont(new Font("SansSerif", Font.BOLD, 15 ));

    }

    public Point getLocation() {
        return location;
    }
    public String getLabel() {
        return textField.getText();
    }
    public Color getColor() {return color;}
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }

}
