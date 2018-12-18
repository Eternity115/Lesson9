
package ShapesV1;

import ShapesV1.Wheel;
import ShapesV1.Shape;
import ShapesV1.Rect;
import TurtleGraphics.*;
import java.awt.Color;


public class Car {
    private Shape parts[];
    private Color color = Color.blue;
    
    public Car (double x, double y){
        parts = new Shape[4];
        //body
        parts[0] = new Rect(x,y,300,80);
        //window
        parts[1] = new Rect(x+75, y+50,150,50);
        //tires
        parts[2] = new Wheel(x+60,y-80,30, 6);
        parts[3] = new Wheel(x+225,y-80,30, 6);
    }
    
    public void move(double x, double y){ 
        for (Shape s : parts) {
            double oxp = s.getXpos();
            double oyp = s.getYpos();
            s.move(oxp+x, oyp+y);
        }
    }    
    
    public void draw(Pen p){
        for (int i = 0; i < 4; i++) {
            parts[i].draw(p);
        }
    }   
}
