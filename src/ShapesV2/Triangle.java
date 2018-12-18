
package ShapesV2;

import TurtleGraphics.Pen;


public class Triangle extends AbstractShape{
    private double x2, x3, y2, y3;
    
    public Triangle(){
        super(0,0);
        x2=1;
        y2=1;
        x3=2;
        y3=0;
    }
    
    public Triangle(double x, double y){
        super(x,y);
        
        x2=x+50;
        y2=y;
        x3=x+25;
        y3=y+40;

    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos, yPos);
        
        
    }

    @Override
    public double area() {
        return Math.abs((xPos*y2-x2-yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3))/2;
    }

    @Override
    public void stretchBy(double factor) {
        x2 = (x2-xPos) * factor + xPos;
        y2 = (y2-yPos) * factor + yPos;
        x3 = (x3-xPos) * factor + xPos;
        y3 = (y3-yPos) * factor + yPos;
    }

    @Override
    public double perimeter() {
        double perm=0,length;
        length = Math.sqrt((xPos-x2)* (xPos-x2) + (yPos-y2)*(yPos-y2));
        perm+=length;
        length = Math.sqrt((x2-x3)* (x2-x3) + (y2-y3)*(y2-y3));
        perm+=length;
        length = Math.sqrt((x3-xPos)* (x3-xPos) + (y3-yPos)*(y3-yPos));
        perm+=length;
        return perm;
    }

    @Override
    public void move(double x, double y) { //FIX THIS METHOD
        double changex = x-xPos;
        double changey = y-yPos;
        xPos=x;
        yPos=y;
        x2= x2+changex;
        y2= y2+changey;
        x3= x3+changex;
        y3= y3+changey;
    }
    
    public String toString(){
        String str= "TRIANGLE\n======\n";
        str+= super.toString();
        str+=  "X2: " + x2 + ", Y2: " + y2 + "\n";
        str+=  "X3: " + x3 + ", Y3: " + y3 + "\n";
        return str;
    }
    
}
