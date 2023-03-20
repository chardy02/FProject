import java.awt.*;

public class StopBlock extends CodeBlock{
    public StopBlock(int xPosCenter, int yPosCenter){
        Circle circle = new Circle(xPosCenter, yPosCenter, 50, Color.RED);
        DotDecorator dotDecorator = new DotDecorator(circle);
        super(dotDecorator, 1, 0);
    }
}