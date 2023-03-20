import java.awt.*;
import java.awt.geom.Line2D;

enum LineType {
    LINE,
    ARROW
}

public class Line {
    private Color color;
    private Shape startShape;
    private Shape endShape;
    private LineType type;
    private String label;

    public Line(Color color, Shape startShape, Shape endShape, LineType type, String label) {
        this.color = color;
        this.startShape = startShape;
        this.endShape = endShape;
        this.type = type;
        this.label = label;
    }

    public void draw(Graphics g) {
        if (this.type == LineType.LINE) {
            this.drawLine(g);
        } else {
            // draw arrow for now draw line
            this.drawLine(g);
        }
    }

    private void drawLine(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.drawLine(
                startShape.getLocation().x,
                startShape.getLocation().y,
                endShape.getLocation().x,
                endShape.getLocation().y
        );

        double dy = endShape.getLocation().y - startShape.getLocation().y;
        double dx = endShape.getLocation().x - startShape.getLocation().x;

        double theta = Math.atan2(dy, dx);
        double x, y, rho = theta + Math.toRadians(40);
        for(int j = 0; j < 2; j++) {
            x = endShape.getLocation().x - 20 * Math.cos(rho);
            y = endShape.getLocation().y - 20 * Math.sin(rho);
            g2.draw(
                    new Line2D.Double(
                            endShape.getLocation().x,
                            endShape.getLocation().y,
                            startShape.getLocation().x,
                            startShape.getLocation().y
                    )
            );
            rho = theta - Math.toRadians(40);
        }

        double deltaX = endShape.getLocation().y - startShape.getLocation().y;
        double deltaY = endShape.getLocation().x - startShape.getLocation().x;
        double textAngle = Math.atan(deltaY/deltaX);

        int textWidth = g.getFontMetrics().stringWidth(this.label);
        g.setColor(Color.BLACK);

        g2.rotate(textAngle,startShape.getLocation().x, startShape.getLocation().y);

        int offset = 10;
        if(deltaX > 0) offset = -textWidth-10;

        g.drawString(this.label, startShape.getLocation().x + offset,startShape.getLocation().y-4);
        g2.rotate(2*Math.PI - textAngle,startShape.getLocation().x,startShape.getLocation().y);

    }
}
