import java.awt.*;

public abstract class ShapeDecorator extends Shape {
    Shape innerShape;
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
}