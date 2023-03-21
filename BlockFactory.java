import java.awt.*;

public class BlockFactory {
    public CodeBlock makeBlock(String type, int xPosCenter, int yPosCenter){
        if(type == null)
            return null;
        TextDecorator textDecorator;
        AlternateTextDecorator alternateTextDecorator;
        Shape shape;
        if(type.equals("If")){
            shape = new Diamond(xPosCenter, yPosCenter, 50, 60, Color.ORANGE);
            textDecorator = new TextDecorator(shape, "IF");
            return new IfBlock(textDecorator);
        }  else if(type.equals("Instruction")){
            shape = new Rectangle(xPosCenter, yPosCenter, 100, 50, Color.BLUE);
            textDecorator = new TextDecorator(shape, "INSTRUCTION");
            return new InstructionBlock(textDecorator);
        } else if(type.equals("Loop")){
            shape = new Diamond(xPosCenter, yPosCenter, 50, 60, Color.PINK);
            textDecorator = new TextDecorator(shape, "LOOP");
            return new LoopBlock(textDecorator);
        } else if(type.equals("Print")){
             shape = new Parallelogram(xPosCenter, yPosCenter, 50, 60, Color.ORANGE);
             textDecorator = new TextDecorator(shape, "PRINT");
             return new LoopBlock(textDecorator);
        } else if(type.equals("Start")){
             shape = new Circle(xPosCenter, yPosCenter, 50, Color.GREEN);
             return new StartBlock(shape);
        } else if(type.equals("End")){
            shape = new Circle(xPosCenter, yPosCenter, 50, Color.RED);
            //DotDecorator dotDecorator = new DotDecorator(shape);
            return new StartBlock(shape);
        } else if(type.equals("Variable")){
            shape = new VarShape(xPosCenter, yPosCenter, 100, 40, Color.decode("#f5f5dc"));
            alternateTextDecorator = new AlternateTextDecorator(shape, "VARIABLE");
            return new VariableBlock(alternateTextDecorator);
        }
        else if(type.equals("Function")){
            shape = new FuncShape(xPosCenter, yPosCenter, 100, 40, Color.decode("#f5f5dc"));
            alternateTextDecorator = new AlternateTextDecorator(shape, "FUNCTION");
            return new VariableBlock(alternateTextDecorator);
        }
        return null;
    }
}
