public class VariableBlock extends CodeBlock{
    Drawable drawable;
    /**
     * @author alexbanham
     * Creates a VariableBlock object
     * @param wrapper the drawable component
     */
    public VariableBlock(Drawable wrapper) {
        super(wrapper,1,1);
        drawable = wrapper;
    }
    @Override
    public int getWidth() {
        return drawable.getWidth();
    }

    @Override
    public int getHeight() {
        return drawable.getHeight();
    }
}
