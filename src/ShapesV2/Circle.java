
package ShapesV2;

import TurtleGraphics.Pen;

public class Circle extends AbstractShape{
    protected double radius;
    
    public Circle(){
        super(0,0);
        radius=1;
    }
    
    public Circle(double x, double y, double r){
        super(x,y);
        radius = r;
    }
    
    
    
    
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
    public void stretchBy(double factor) {
        radius*=factor;
    }
    
    @Override
    public double perimeter() {
        double circ = 2* Math.PI*radius;
        return circ;
    }

    
    public String toString(){
        String str= "CIRCLE\n======\n";
        str+= super.toString();
        str+= "Radius: " + radius + "\n";
        return str;
    }

    @Override
    public void move(double x, double y) {
        xPos=x;
        yPos=y;
    }

    
}
