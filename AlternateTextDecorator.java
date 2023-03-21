import java.awt.*;

public class AlternateTextDecorator extends DrawableDecorator {

    private String text;
    public AlternateTextDecorator(Drawable drawable, String text) {
        super(drawable);
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
        g.drawString(text, (int) (getXCenter() - (textWidth / 10)), getYCenter());
    }
}
