import java.awt.*;

public class Line implements Drawable {
    private CodeBlock start;
    private CodeBlock end;

    public Line(CodeBlock s, CodeBlock e) {
        start = s;
        end = e;
    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Shape sShape = (Shape) start.getShape();
        Shape eShape = (Shape) end.getShape();

        g2d.drawLine(sShape.getCenterX(), sShape.getCenterY(), eShape.getCenterX(), eShape.getCenterY());
    }

    @Override
    public int getXCenter() {
        return 0;
    }
    @Override
    public int getYCenter() {
        return 0;
    }
}