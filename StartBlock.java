import java.awt.*;

public class StartBlock extends CodeBlock{

    final int radius = 50;
    public StartBlock(Drawable drawable){
        super(drawable, 0, 1);
    }
    @Override
    public int getWidth() {
        return radius / 2;
    }

    @Override
    public int getHeight() {
        return radius / 2;
    }
}
