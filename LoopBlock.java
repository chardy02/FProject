public class LoopBlock extends CodeBlock {

    private Drawable wrapper;

    public LoopBlock(Drawable drawable) {
        super(drawable, 2, 2);
        wrapper = drawable;
    }

    @Override
    public int getWidth() {
        return wrapper.getWidth();
    }

    @Override
    public int getHeight() {
        return wrapper.getHeight();
    }
}
