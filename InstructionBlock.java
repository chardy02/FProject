public class InstructionBlock extends CodeBlock {
    Drawable drawable;
    public InstructionBlock(Drawable wrapper) {
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
