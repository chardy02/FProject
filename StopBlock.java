import java.awt.*;

public class StopBlock extends CodeBlock {
    private Drawable drawable;

    public StopBlock(Drawable wrapper){
        super(wrapper, 1, 0);
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