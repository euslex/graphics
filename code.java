import java.applet.*;
import java.awt.*;
import java.util.*;

public class code extends Applet{
	int centerX, centerY, dGrid = 1, maxX, maxY;
    
void initgr() {
	Dimension d;	
	d = getSize();
	maxX = d.width - 1; 
	maxY = d.height - 1;
	centerX = maxX/2; centerY = maxY/2;
   	}
	
void drawCircle(Graphics g,int x_centre, int y_centre, int r) {
         
        int x = r, y = 0;
     
		g.fillOval(x + x_centre, y+y_centre, 5, 5);
     
        
        if (r > 0) {
			g.fillOval(x + x_centre, -y + y_centre, 5, 5);
			g.fillOval(y + x_centre, x + y_centre, 5, 5);
			g.fillOval(-y + x_centre, x + y_centre, 5, 5);
        }
     
       
        int P = 1 - r;
        while (x > y) {
             
            y++;
            if (P <= 0)
                P = P + 2 * y + 1;
            else {
                x--;
                P = P + 2 * y - 2 * x + 1;
            }
            if (x < y)
                break;
         
			g.fillOval(x + x_centre, y + y_centre, 5, 5);
			g.fillOval(-x + x_centre, y + y_centre, 5, 5);
			g.fillOval(x + x_centre, -y + y_centre, 5, 5);
			g.fillOval(-x + x_centre, -y + y_centre, 5, 5);
     
         
          
            if (x != y) {
				g.fillOval(y + x_centre, x + y_centre, 5, 5);
				g.fillOval(-y + x_centre, x + y_centre, 5, 5);
				g.fillOval(y + x_centre, -x + y_centre, 5, 5);
				g.fillOval(-y + x_centre, -x + y_centre, 5, 5);
            }
        }
    }
	
void drawLine(Graphics g, int x1, int y1, int x2, int y2) { 
   
	int dx = Math.abs(x2 - x1);
    int dy = Math.abs(y2 - y1);

    int sx = (x1 < x2) ? 1 : -1;
    int sy = (y1 < y2) ? 1 : -1;

    int err = dx - dy;
    int x = x1;
    int y = y1;

    while (true) {
        g.fillOval(x, y, 5, 5);

        if (x == x2 && y == y2) {
            break;
        }

        int err2 = 2 * err;

        if (err2 > -dy) {
            err -= dy;
            x += sx;
        }

        if (err2 < dx) {
            err += dx;
            y += sy;
        }
    }

}

	public void paint(Graphics g) {
		initgr();
		drawCircle(g, centerX, centerY, 100);
		
		drawLine(g, centerX -100, centerY-150, centerX-100, centerY+150);
		drawLine(g, centerX-100, centerY+150, centerX+100, centerY+150);
		drawLine(g, centerX+100, centerY+150, centerX+100, centerY-150);
		drawLine(g, centerX+100, centerY-150, centerX-100, centerY-150);
		
		drawLine(g, centerX+100, centerY-150, centerX+150, centerY-200);
		drawLine(g, centerX+150, centerY-200, centerX+150, centerY+100);
		drawLine(g, centerX+150, centerY+100, centerX+100, centerY+150);
		
		drawLine(g, centerX+150, centerY-200, centerX-25, centerY-200);
		drawLine(g, centerX-25, centerY-200, centerX-100, centerY-150);
		
		drawCircle(g, centerX+125, centerY, 25);
		drawCircle(g, centerX+50, centerY-175, 25);
 
	}	
	
	  
	

}

/*<applet code="DdaAlg.class" width="1000" height="1000">
 </applet>

 */