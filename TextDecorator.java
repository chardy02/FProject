import java.awt.*;

public class TextDecorator extends DrawableDecorator {

    private String text;
    public TextDecorator(Drawable drawable, String text) {
        super(drawable);
        if(text == null){
            throw new NullPointerException("TextDecorator: text can't be null");
        }
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        int textWidth = g.getFontMetrics().stringWidth(text);
        g.setColor(Color.BLACK);
        g.drawString(text,  (getXCenter() - textWidth / 2), getYCenter());
        getInnerDrawable().draw(g);
    }
}
