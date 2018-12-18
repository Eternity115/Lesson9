
package ShapesV1;

import ShapesV1.Wheel;
import ShapesV1.Circle;
import ShapesV1.Shape;
import ShapesV1.Rect;
import TurtleGraphics.*;
import java.awt.Color;

public class ShapeMaker {

    
    public static void main(String[] args) {
        SketchPadWindow window = new SketchPadWindow (800,600);
        Pen p = new StandardPen(window);
        
        Rect x = new Rect (100,50,200,75);
        x.draw(p);
        
        Shape y = new Rect (-200,-100,50,100);
        p.setColor(Color.red);
        y.draw(p);
        System.out.println(x); //toString
        System.out.println(y);
        
        p.setColor(Color.green);
        y.move(0, 0);
        y.draw(p);
        
        //stretch y by 2
        p.setColor(Color.yellow);
        y.stretchBy(2);
        y.draw(p);
        
        Shape z = new Circle (-200,-200,50);
        p.setColor(Color.orange);
        z.draw(p);
        
        p.setColor(Color.magenta);
        z.stretchBy(0.5);
        z.draw(p);
        
        Shape w = new Wheel(100,100,50,20);
        w.draw(p);
        
        w.move(-150, 150);
        p.setColor(Color.green);
        ((Wheel)w).setSpokes(10);
        w.stretchBy(1.5);
        w.draw(p);

        
    }
    
}
