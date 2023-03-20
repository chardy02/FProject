import java.awt.*;

public class Line implements Drawable {
    private Point start;
    private Point end;

    public Line(CodeBlock s, CodeBlock e) {
        Shape sShape = (Shape) start.getShape();
        Shape eShape = (Shape) end.getShape();
        start = new Point(sShape.getCenterX(), sShape.getCenterY());
        end = new Point(eShape.getCenterX(), eShape.getCenterY());
    }
    public Line(Point s, Point e) {

    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(start.x, start.y, end.x, end.y);
    }

    @Override
    public int getXCenter() { return 0; }
    @Override
    public int getYCenter() {
        return 0;
    }
}