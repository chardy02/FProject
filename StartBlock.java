public class StartBlock extends CodeBlock{
    public StartBlock(int xPosCenter, int yPosCenter){
        Circle circle = new Circle(xPosCenter, yPosCenter);
        super(circle, 0, 1);
    }
}
