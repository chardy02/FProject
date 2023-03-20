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
    public PrintBlock(Drawable wrapper) {
        super(wrapper, 1, 1);
    }
}
