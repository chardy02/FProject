/**
 * Defines the StartBlock class, which is to
 * be used to be instantiated to make objects
 * of type StartBlock to represent the starting
 * point of a flowchart.
 *
 * @author Aaron Bettencourt
 */
public class StartBlock extends CodeBlock{

    /**
     * Constructs a CodeBlock with 0 inbound lines
     * and at most 1 outbound line that is representable by a shape.
     *
     * @param wrapper   A Shape representation of this StartBlock
     *                  that may contain more Shapes inside.
     */
    public StartBlock(Shape wrapper){
        super(wrapper, 0, 1);
    }

}
