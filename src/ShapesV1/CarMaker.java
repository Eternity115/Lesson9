
package ShapesV1;

import ShapesV1.Car;
import TerminalIO.*;
import TurtleGraphics.*;
import java.awt.Color;
import javax.swing.JColorChooser;


public class CarMaker {

    
    public static void main(String[] args) {
        SketchPadWindow window = new SketchPadWindow (800,600);
        Pen p = new StandardPen(window);
        p.setWidth(5);
        KeyboardReader k = new KeyboardReader();
        Car x = new Car (-200,0);
        x.draw(p);
        while (true){
            double xp = k.readDouble("Enter new x (or -999 to quit): ");
            if (xp==-999) break;
            double yp = k.readDouble("Enter new y (or -999 to quit): ");
            Color col = JColorChooser.showDialog(window.getParent(), "Pick a face colour", Color.RED);
            p.setColor(Color.white);
            x.draw(p);
            p.setColor(col);
            x.move(xp, yp);
            x.draw(p);
        }
        
    }
    
}
