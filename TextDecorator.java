import java.awt.*;

public class TextDecorator extends ShapeDecorator {

    private String text;
    Drawable wrapper;

    public TextDecorator(Shape drawable, String text) {
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
        super.draw(g);
        g.setColor(Color.BLACK);
        g.drawString(text,  (getXCenter() - textWidth / 2), getYCenter());
    }

}
