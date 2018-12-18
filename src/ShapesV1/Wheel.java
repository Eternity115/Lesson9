
package ShapesV1;

import ShapesV1.Circle;
import TurtleGraphics.*;


public class Wheel extends Circle{
    private int spokes; //plus wheel inherits 3 props from circle
    
    public Wheel(){
        //call parent constructor
        super();
        spokes = 3;        
    }
    
    public Wheel(double x, double y, double r, int s){
        //call parent and send up x, y, r
        super(x,y,r);
        spokes=s;
    }
    
    //following methods are good to go as is from parent, therefore no code needed down here
    //getXPos(), getYPos(), area(), move(), stretchy()
    
    
    public void draw(Pen p){
        //call parent draw
        super.draw(p);
        //draw the spokes
        p.up();
        p.move(xPos, yPos);
        double turn = 360/spokes;
        for (int i = 1; i <= spokes; i++) {
            p.down();
            p.setDirection(i*turn);
            p.move(radius);
            p.up();
            p.move(xPos, yPos);
        }
    }
    
    //exclusive method -> only wheel can do this
    public void setSpokes(int s){
        spokes = s;
    }
    
    @Override
    public String toString(){
        String str = "WHEEL\n======\n";
        str += "XPos: " + xPos + ", YPos " + yPos;
        str += "\nRadius: " + radius;
        str += "\nArea: " + area();
        str += "\nSpokes: " + spokes;
        return str;
    }
    
    
    
}
