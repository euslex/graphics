import java.util.*;
import java.awt.*;
import java.applet.*;

public class translatePoint extends Applet{
   /* 
      int xcenter,ycenter,xmax,ymax;
      public void center()
      {
         Dimension d;
         d=getSize();
         xmax=d.width-1;
         ymax=d.height-1;
         xcenter=xmax/2;
         ycenter=ymax/2;

      }
*/
      public void translatePoint(Graphics g,int p[],int t[])
      {
        for(int i=0;i<p.length;i=i+2)
        {
         g.setColor(Color.red);
           g.fillOval((int)p[i],(int)p[i+1],20,20);
        }   
        //translate point
        for(int i=0;i<p.length;i++)
        {
         p[i]+=t[i];
        }
        //after translation
        for(int i=0;i<p.length;i=i+2){
         g.setColor(Color.blue);
           g.fillOval((int)p[i],(int)p[i+1],20,20);
        }
      }
      public void paint(Graphics g) {
           int p[]={20,20};
           int t[]={200,300};
           translatePoint(g,p,t);
      };
}