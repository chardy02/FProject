class HorizontalLine extends DrawableDecorator {

    Line line1;
    Line line2;
    public HorizontalLine(Drawable innerDrawable, Line line1, Line line2) {

        if(innerDrawable == null){
            throw new NullPointerException();
        }
        this.innerDrawable = innerDrawable;
        this.line1 = line1;
        this.line2 = line2;

    }

    public Line getLine1() { return this.line1; }

    public Line getLine2() { return this.line2; }

    public void setLine1(Line line) { this.line1 = line; }

    public void setLine2(Line line) { this.line2 = line; }

    @Override
    public void draw(Graphics g) {
        this.line1.draw(g);
        this.line2.draw(g);
    }


}