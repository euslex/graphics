import java.util.*;
import java.awt.*;
import java.applet.*;

public class MidcirApp extends Applet{	
	
	int xc,yc,r,d,xend,x,y;
	int maxX,maxY,centerX,centerY;
	
	
	public shape(){
	}
	public void initgr(){
		Dimension d;
		d = getSize();
		maxX = d.width-1;
		maxY = d.height-1;
		centerX = maxX/2;
		centerY = maxY/2;
		System.out.println("centerX : " +centerX);
		System.out.println("centerY : " +centerY);
	}
	
	public void drawcir(Graphics g, int xc,int yc,int r){
		x=0;
		y=r;
		
		d=3-2*r;
		xend = (int)(r/Math.sqrt(2));
		
		for(x=0; x<=xend; x++){
			g.fillOval(xc+x, yc+y, 5,5);
			g.fillOval(xc+x, yc-y, 5,5);
			g.fillOval(xc+y, yc+x, 5,5);
			g.fillOval(xc+y, yc-x, 5,5);
			g.fillOval(xc-x, yc+y, 5,5);
			g.fillOval(xc-x, yc-y, 5,5);
			g.fillOval(xc-y, yc+x, 5,5);
			g.fillOval(xc-y, yc-x, 5,5);
			
			if(d>0){
				d=d+4*(x-y)+10;
				y=y-1;
			}
			else{
				d=d+4*x+6;
				y=y;
			}
		}
	}
	
	public void paint(Graphics g){
		initgr();
		
		
		drawcir(g,400,225,75);
		
		drawline(g,400,300,200,500);
		
		drawline(g,200,500,550,500);
		
		drawline(g,200,500,550,500);
		
		drawline(g,320,700,480,700);
		
		drawline(g,320,500,320,700);
		
		drawline(g,480,500,480,700);
		
	}
}
/*
<applet code="shape.class" width="1000" height="1000"></applet>
*/