import java.awt.*;

public abstract class ShapeDecorator extends Shape {
    private Shape innerShape;
    public ShapeDecorator(Shape innerShape){
        super(innerShape.getXCenter(), innerShape.getYCenter(),
                innerShape.getWidth(), innerShape.getHeight(),
                innerShape.getColor());
        this.innerShape = innerShape;
    }

    @Override
    public void draw(Graphics g) {
        innerShape.draw(g);
    }

    @Override
    public void setXCenter(int xPosCenter) {
        super.setXCenter(xPosCenter);
        innerShape.setXCenter(xPosCenter);
    }

    @Override
    public void setYCenter(int yPosCenter) {
        super.setYCenter(yPosCenter);
        innerShape.setYCenter(yPosCenter);
    }
}
