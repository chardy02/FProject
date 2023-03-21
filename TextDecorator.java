import java.awt.*;

public class TextDecorator extends DrawableDecorator {

    private String text;
    Drawable wrapper;

    public TextDecorator(Drawable drawable, String text) {
        super(drawable);
        wrapper = drawable;
        if(text == null){
            throw new NullPointerException("TextDecorator: text can't be null");
        }
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        int textWidth = g.getFontMetrics().stringWidth(text);
        g.setColor(getInnerDrawable().getColor());
        getInnerDrawable().draw(g);
        g.setColor(Color.BLACK);
        g.drawString(text,  (getXCenter() - textWidth / 2), getYCenter());
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
