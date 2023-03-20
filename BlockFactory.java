import java.awt.*;

public class BlockFactory {
    public CodeBlock makeBlock(String type, int xPosCenter, int yPosCenter){
        if(type == null)
            return null;
        TextDecorator textDecorator;
        Shape shape;
        if(type.equals("If")){
            shape = new Diamond(xPosCenter, yPosCenter, 50, 60, Color.ORANGE);
            textDecorator = new TextDecorator(shape, "IF");
            return new IfBlock(textDecorator);
        }  else if(type.equals("Instruction")){
            shape = new Rectangle(xPosCenter, yPosCenter, 100, 50, Color.BLUE);
            textDecorator = new TextDecorator(shape, "INSTRUCTION");
            return new IfBlock(textDecorator);
        } else if(type.equals("Loop")){
            shape = new Diamond(xPosCenter, yPosCenter, 50, 60, Color.ORANGE);
            textDecorator = new TextDecorator(shape, "LOOP");
            return new LoopBlock(textDecorator);
        } else if(type.equals("Print")){
             shape = new Diamond(xPosCenter, yPosCenter, 50, 60, Color.ORANGE);
             textDecorator = new TextDecorator(shape, "PRINT");
             return new LoopBlock(textDecorator);
        } else if(type.equals("Start")){
             shape = new Circle(xPosCenter, yPosCenter, 50, Color.BLUE);
             return new StartBlock(shape);
        } else if(type.equals("Stop")){
            shape = new Circle(xPosCenter, yPosCenter, 50, Color.BLUE);
            //DotDecorator dotDecorator = new DotDecorator(shape);
            return new StartBlock(shape);
        }
        return null;
    }
}
