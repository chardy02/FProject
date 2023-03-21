public class VariableBlock extends CodeBlock{
    Drawable drawable;
    /**
     * @author alexbanham
     * Creates a VariableBlock object
     * @param wrapper the drawable component
     */
    public VariableBlock(Shape wrapper) {
        super(wrapper,1,1);
        drawable = wrapper;
    }
}
