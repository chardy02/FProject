public class StopBlock extends CodeBlock{
    public StopBlock(int xPosCenter, int yPosCenter){
        Circle circle = new Circle(xPosCenter, yPosCenter);
        DotDecorator dotDecorator = new DotDecorator(circle);
        super(dotDecorator, 0, 1);
    }
}