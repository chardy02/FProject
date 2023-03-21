import java.awt.*;

public class IfBlock extends CodeBlock {
    private Drawable drawable;

    public IfBlock(Shape wrapper){
        super(wrapper, 1, 2);
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
