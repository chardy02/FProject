public class IfBlock extends CodeBlock {

    public IfBlock(int xPosCenter, int yPosCenter){
       Diamond diamond = new Diamond(xPosCenter, yPosCenter);
       TextDecorator textDecorator = new TextDecorator(diamond, "IF");
       super(textDecorator, 1, 2);
    }
}
