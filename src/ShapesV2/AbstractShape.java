
package ShapesV2;

import TurtleGraphics.Pen;
import java.text.Format;
import java.text.NumberFormat;


abstract public class AbstractShape {
    protected double xPos, yPos;
    
    public AbstractShape(){
        xPos=0;
        yPos=0;
    }
    
    public AbstractShape(double x, double y){
        xPos=x;
        yPos=y;
    }
    

    public abstract void draw(Pen p);
    public abstract double area();
    public abstract void stretchBy(double factor);
    public abstract double perimeter();
    public abstract void move(double x, double y);
    
    
    public final double getXpos() {
        return xPos;
    }

    public final double getYpos() {
        return yPos;
    }
    
    public String toString(){
        String str=  "XPos: " + xPos + ", YPos: " + yPos + "\n";
        str+= String.format("Area: %.2f%n", area());
        str+= String.format ("Perimeter: %.2f%n", perimeter());
        return str;
    }
    
    
}
