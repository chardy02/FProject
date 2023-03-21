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

        Point startPos = new Point(start.getXCenter(), start.getYCenter() + (start.getHeight() / 2));
        Point endPos = new Point(end.getXCenter(), end.getYCenter() - (end.getHeight() / 2));

        if(startPos.x < endPos.x) {
            if(startPos.y < endPos.y) {
                //negative deg
            }
//        determine slope of line to calculate angle...
        }

        g.setColor(Color.BLACK);
        g2d.drawLine(startPos.x, startPos.y, endPos.x, endPos.y);
//        double theta = Math.atan((double) (endPos.y - startPos.y) / (double)(endPos.x - startPos.x));
//        System.out.println(theta * 360 / (2 * Math.PI));
    }

//    public void update(Point newS, Point newE) {
//        start = newS;
//        end = newE;
//    }
//    public void follow(Point endPt) {
//        end = endPt;
//    }

}