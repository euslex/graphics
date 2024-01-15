import java.applet.*;
import java.awt.*;
import java.util.*;
public class rotation extends Applet{
int maxX , maxY , centerX , centerY ;
public void initgr(){
Dimension d ;
d = getSize() ;
maxX = d.width;
maxY = d.height;
centerX = maxX/2 ;
centerY = maxY/2 ;
}
public void line(Graphics g, double x1, double y1 ,double x2 , double y2){
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
public void drawRectangle(Graphics g,double point[][])
{
      line(g, point[0][0],point[0][1],point[1][0],point[1][1]);
      line(g, point[1][0],point[1][1],point[2][0],point[2][1]);
      line(g, point[2][0],point[2][1],point[3][0],point[3][1]);
      line(g, point[3][0],point[3][1],point[0][0],point[0][1]);
      
}
public void rotate(Graphics g,double tri[][],int X_pivot,int y_pivot,int angle)
{
   for(int i=1;i<4;i++)
   {
    double x=tri[i][0];
    double y=tri[i][1];
      x-=X_pivot;
      y-=y_pivot;

      double xrotated=(double)(x*Math.cos(angle * Math.PI/180) - y*Math.sin(angle * Math.PI/180));
      double yrotated=(double)(x*Math.sin(angle* Math.PI/180) + y*Math.cos(angle * Math.PI/180));
      tri[i][0]=xrotated+X_pivot;
      tri[i][1]=yrotated+y_pivot;
   }
   
}
public void paint(Graphics g){
initgr();
  double triangle[][]={
                    {centerX,centerY},
                    {centerX,centerY-100},
                    {centerX+100,centerY-100},
                    {centerX+100,centerY}
                         };
   drawRectangle(g,triangle);
   rotate(g,triangle,centerX,centerY,30);
   drawRectangle(g,triangle);
}
}