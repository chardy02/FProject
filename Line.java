import java.awt.*;

public class Line implements Drawable {
    private CodeBlock start;
    private CodeBlock end;

    public Line(CodeBlock s, CodeBlock e) {
        start = s;
        end = e;
        s.addToOutbound(e);
        e.addToInbound(s);
//        Drawable sShape = s.getShape();
//        Drawable eShape = e.getShape();
//        start = new Point(sShape.getXCenter(), sShape.getYCenter());
//        end = new Point(eShape.getXCenter(), eShape.getYCenter());
    }
//    public Line(Point s, Point e) {
//        start = s;
//        end = e;
//    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Point startPos = new Point(start.getShape().getXCenter(), start.getShape().getYCenter());
        Point endPos = new Point(end.getShape().getXCenter(), end.getShape().getYCenter());

        g2d.drawLine(startPos.x, startPos.y, endPos.x, endPos.y);
    }

//    public void update(Point newS, Point newE) {
//        start = newS;
//        end = newE;
//    }
//    public void follow(Point endPt) {
//        end = endPt;
//    }

    @Override
    public int getXCenter() { return 0; }
    @Override
    public int getYCenter() { return 0; }
    @Override
    public void setXCenter(int xCenter) {}
    @Override
    public void setYCenter(int yCenter) {}

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public boolean isInBounds(int x, int y) {
        return false;
    }
}