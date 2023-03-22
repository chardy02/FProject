import java.awt.*;


public class Line implements Drawable {
    private CodeBlock start;
    private CodeBlock end;

    private Point followingPt = null;
    private boolean following = false;

    public Line(CodeBlock s, CodeBlock e) {
        start = s;
        end = e;
        if(s != null && e != null) {
            s.addToOutbound(e);
            e.addToInbound(s);
        }
    }
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Point endPos;
        Point startPos = new Point(start.getXCenter(), start.getYCenter() + (start.getHeight() / 2));
        if (following) {
            endPos = followingPt;
        }
        else {
            endPos = new Point(end.getXCenter(), end.getYCenter() - (end.getHeight() / 2));

        }
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

    public void update(CodeBlock newEnd) {
        end = newEnd;
        following = false;
    }
    public void follow(Point mPt) {
        following = true;
        followingPt = mPt;
    }

}