
package ShapesV2;

import TurtleGraphics.Pen;

public class Rect extends AbstractShape{
    private double width, height;
    
    public Rect(){
        super(0,0);
        width=1;
        height=1;
    }
    
    public Rect(double x, double y, double w, double h){
        super(x,y);
        width=w;
        height=h;
    }
    
    
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.down();
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    @Override
    public double area() {
        return width*height;
    }


    @Override
    public void stretchBy(double factor) {
        width*=factor;
        height*=factor;
    }
    
    @Override
    public double perimeter() {
        double perm = (width + height)*2;
        return perm;
    }
    
    @Override
    public void move(double x, double y) {
        xPos=x;
        yPos=y;
    }


    
    public String toString(){
        String str= "RECTANGLE\n======\n";
        str+= super.toString();
        str+= "Width: " + width + ", Height: " + height + "\n";
        return str;
    }

    
    
}
