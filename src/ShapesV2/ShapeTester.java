
package ShapesV2;

import TurtleGraphics.*;
import java.awt.Color;


public class ShapeTester {

    
    public static void main(String[] args) {
        AbstractShape x,y,z,t;
        StandardPen p = new StandardPen (new SketchPadWindow(800,600));
        x = new Circle(0,0,100);
        y = new Wheel(200,200,50,6);
        z = new Rect(-200,200,100,50);
        t = new Triangle(0,0);
        x.draw(p);
        y.draw(p);
        z.draw(p);
        p.setColor(Color.cyan);
        t.draw(p);
        t.stretchBy(4);
        t.draw(p);
        t.move(100, 100);
        t.draw(p);
        
        
        Circle c = new Circle(-200,-200,50);
        c.draw(p);
        
        p.setColor(Color.red);
        c = new Wheel(-100,-100,25,3);
        c.draw(p);
        
        System.out.println("Is c a cirlce? " + (c instanceof Circle));
        System.out.println("Is c a wheel? " + (c instanceof Wheel));
        System.out.println("Is x a cirlce? " + (x instanceof Circle));
        System.out.println("Is x a wheel? " + (x instanceof Wheel));
        System.out.println("Are x,y,z and c AbstractShapes? " + (x instanceof AbstractShape)+ (y instanceof AbstractShape)+ (z instanceof AbstractShape)+ (c instanceof AbstractShape));
        
        Wheel w = new Wheel();
        System.out.println("Is w a cirlce? " + (w instanceof Circle));
        
        
    }
    
}
