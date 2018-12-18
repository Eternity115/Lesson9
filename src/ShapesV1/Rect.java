
package ShapesV1;

import ShapesV1.Shape;
import TurtleGraphics.Pen;

public class Rect implements Shape{
    private double xPos, yPos;
    private double width, height;
    
    public Rect(){
        xPos=0;
        yPos=0;
        width=1;
        height=1;
    }
    
    public Rect(double x, double y, double w, double h){
        xPos=x;
        yPos=y;
        width=w;
        height=h;
    }
    
    @Override
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
    public double getXpos() {
        return xPos;
    }

    @Override
    public double getYpos() {
        return yPos;
    }

    @Override
    public void stretchBy(double factor) {
        width*=factor;
        height*=factor;
    }

    @Override
    public void move(double x, double y) {
        xPos = x;
        yPos = y;
    }
    
    public String toString(){
        String str= "RECTANGLE\n======\n";
        str+= "XPos: " + xPos + ", YPos: " + yPos + "\n";
        str+= "Width: " + width + ", Height: " + height + "\n";
        str+= "Area: " + area();
        return str;
    }
    
}
