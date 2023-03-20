import java.awt.*;

public abstract class DrawableDecorator implements Drawable {
    private Drawable innerDrawable;

    public DrawableDecorator(Drawable innerDrawable){
        if(innerDrawable == null){
            throw new NullPointerException();
        }
        this.innerDrawable = innerDrawable;
    }

    public Drawable getInnerDrawable(){
        return innerDrawable;
    }
    @Override
    public int getXCenter() {
        return innerDrawable.getXCenter();
    }

    @Override
    public int getYCenter() {
        return innerDrawable.getYCenter();
    }

    @Override
    public void setXCenter(int xCenter) {
        innerDrawable.setXCenter(xCenter);
    }
    @Override
    public void setYCenter(int yCenter) {
        innerDrawable.setXCenter(yCenter);
    }

    @Override
    public Color getColor() {
        return innerDrawable.getColor();
    }

    @Override
    public boolean isInBounds(int x, int y) {
        return innerDrawable.isInBounds(x, y);
    }
}
