import java.applet.*;
import java.awt.*;
import java.util.*;

public class ddaalg1 extends Applet{
	int centerX, centerY, dGrid = 1, maxX, maxY;
    
void initgr() {
	Dimension d;	// get the window size and compute minimum, maximum and center
	d = getSize();
	maxX = d.width - 1; 
	maxY = d.height - 1;
	centerX = maxX/2; centerY = maxY/2;
   	}
	
void drawLine(Graphics g, int x1, int y1, int x2, int y2) { // DDA Algorithm 
	double xc,yc;
	double dx,dy,steps,x,y,k;
	
	dx=x2-x1;
	dy=y2-y1;
    
	if(Math.abs(dx)>Math.abs(dy))
		steps=Math.abs(dx);
	else
		steps=Math.abs(dy);
        
		xc=(dx/steps);
		yc=(dy/steps);
		x=x1;
		y=y1;
    	    
	for(k=1;k<=steps;k++){
		x=x+xc;
		y=y+yc;
		g.fillOval((int)x,(int)y,5,5);
	}	
}

	public void paint(Graphics g) {
		initgr();
		drawLine(g, centerX-100, centerY-100, centerX+100, centerY-100);
		//drawLine(g, centerX+100, centerY-100, centerX+100, centerY+100);
		//drawLine(g, centerX+100, centerY+100, centerX-100, centerY+100);
		//drawLine(g, centerX-100, centerY+100, centerX-100, centerY-100);
		
		//drawLine(g, centerX, centerY-240, centerX+240, centerY+100);
		//drawLine(g, centerX, centerY-240, centerX-240, centerY+100);
		//drawLine(g, centerX-240, centerY+100, centerX+240, centerY+100);
		
		//drawCircle(g, 230, 100, 40);
	}	

}

/*<applet code="ddaalg.class" width="1000" height="1000">
 </applet>

 */