import java.util.*;
import java.awt.*;
import java.applet.*;
public class scaling extends Applet{
      //for DDA
      public void DDALINE(Graphics g,int x1,int y1,int x2,int y2)
      {
        int steps,dx,dy;
        float x,y,Xinc,Yinc;
        dx=x2-x1;
        dy=y2-y1;
        if(Math.abs(dx)>Math.abs(dy))
        {
            steps=Math.abs(dx);
        }
        else
        {
            steps=Math.abs(dy);
        }
        x=x1;y=y1;
       g.fillOval((int)x,(int)y,10,10);
       Xinc=dx/steps;
       Yinc=dy/steps;
       for(int k=1;k<steps;k++)
       {
         x+=Xinc;y+=Yinc;
          g.fillOval((int)x,(int)y,10,10);
       }
      }
      //for scaling
      void Scale(Graphics g,int x[],int y[],int sx,int sy)
      {
           for(int i=0;i<x.length;i++)
           {
               x[i]*=sx;
               y[i]*=sy;
           }

           for(int i=0;i<x.length;i++)
           {
              if(i==x.length-1)
              {
                DDALINE(g,x[i],y[i],x[i-(x.length-1)],y[i-(x.length-1)]);
              }      
              else
              {
                DDALINE(g,x[i],y[i],x[i+1],y[i+1]);
              }             
           }
      }
      public void paint(Graphics g)
      {
          int x[]={0,100,100,0};
          int y[]={0,0,100,100};
          for(int i=0;i<x.length;i++)
           {
              if(i==x.length-1)
              {
                DDALINE(g,x[i],y[i],x[i-(x.length-1)],y[i-(x.length-1)]);
              }      
              else
              {
                DDALINE(g,x[i],y[i],x[i+1],y[i+1]);
              }             
           }
           Scale(g, x,y,2,3);
          
      }
}