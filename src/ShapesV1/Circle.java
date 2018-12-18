
package ShapesV1;

import ShapesV1.Shape;
import TurtleGraphics.Pen;

public class Circle implements Shape{
    protected double xPos, yPos;
    protected double radius;
    
    public Circle(){
        xPos=0;
        yPos=0;
        radius=1;
    }
    
    public Circle(double x, double y, double r){
        xPos = x;
        yPos = y;
        radius = r;
    }
    
    
    
    @Override
    public void draw(Pen p) {
        double side = Math.PI * 2 * radius / 120;
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.move(radius);
        p.down();
        p.turn(90);
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
        
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
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
        radius*=factor;
    }

    @Override
    public void move(double x, double y) {
        xPos = x;
        yPos = y;
    }
    
    public String toString(){
        String str= "CIRCLE\n======\n";
        str+= "XPos: " + xPos + ", YPos: " + yPos + "\n";
        str+= "Radius: " + radius + "\n";
        str+= "Area: " + area();
        return str;
    }
}
