import java.awt.*;

/**
 * Print Code Block
 * @author Patrick Whitlock
 */
public class PrintBlock extends CodeBlock {

    /**
     * Creates a PrintBlock object
     * @param xPosCenter x location
     * @param yPosCenter y location
     */
    public PrintBlock(int xPosCenter, int yPosCenter) {
        Parallelogram parallelogram = new Parallelogram(Color.ORANGE,new Point(xPosCenter,yPosCenter),"");
        TextDecorator textDecorator = new TextDecorator(parallelogram, "PRINT");
        super(textDecorator, 1, 2);
    }
}
