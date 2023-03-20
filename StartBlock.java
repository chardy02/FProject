import java.awt.*;

public class StartBlock extends CodeBlock{
    final int radius = 50;
    public StartBlock(int xPosCenter, int yPosCenter){
        Circle circle = new Circle(xPosCenter, yPosCenter, 50, Color.BLUE);
        super(circle, 0, 1);
    }
}
