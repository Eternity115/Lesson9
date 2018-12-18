
package ShapesV1;

import ShapesV1.Wheel;
import ShapesV1.Circle;
import ShapesV1.Shape;
import ShapesV1.Rect;
import TurtleGraphics.*;
import java.awt.Color;

public class ShapeMaker2 {

    
    public static void main(String[] args) {
        StandardPen p= new StandardPen(new SketchPadWindow(600,400));
        Shape x = new Rect (0,0,200,50);
        Circle y = new Wheel(50,50,50,7);
        //Wheel z = new Circle (200,-200,100,5); can't go the other way
        Circle z = (Circle) anyShapeFromAnyShape(y, "c");
        Rect r =  (Rect) anyShapeFromAnyShape(x, "r");
        x.draw(p);
        y.draw(p);
        p.setColor(Color.red);
        z.move(-200, -100);
        z.draw(p);
        r.move(-200, 100);
        r.draw(p);
        
    }
    
    public static Shape anyShapeFromAnyShape(Shape any, String type){
        //get data from incoming shape
        double x = any.getXpos();
        double y = any.getYpos();
        double area = any.area();
        
        if (type.equals ("c")){
            //work backwards to get radius
            double rad = Math.sqrt(area/Math.PI);
            return new Circle (x,y,rad);
        }
        else if(type.equals("w")){
            double rad = Math.sqrt(area/Math.PI);
            return new Wheel (x,y,rad, 6);
        }
        else if(type.equals("r")){
            double w = Math.sqrt(area);
            double h = Math.sqrt(area);
            return new Rect (x,y,w,h);
        }
        else
            return null;
        
    }
    
    
    
    
}
