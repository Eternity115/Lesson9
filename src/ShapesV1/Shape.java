
package ShapesV1;

import TurtleGraphics.*;
import BreezySwing.*;

public interface Shape {
    /**
     * 
     * @param p 
     */
    public void draw(Pen p);
    public double area();
    public double getXpos();
    public double getYpos();
    public void stretchBy(double factor);
    public void move(double x, double y);
    public String toString();
    
}
