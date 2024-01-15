import java.util.*;
import java.applet.*;
import java.awt.*;
public class ddaAlg extends Applet{
    int centerX,centerY,xMax,yMax;
    void Center()
    {
         Dimension d;
         d=getSize();
         xMax=d.width-1;
         yMax=d.height-1;
         centerX=xMax/2;
         centerY=yMax/2;

    }
    public void Line(Graphics g,int x0,int y0,int x1,int y1)
    {
        int dx=x1-x0;
        int dy=y1-y0;
        int steps;
        int x,y;
        int Xinc,Yinc;
        if(Math.abs(dx)>Math.abs(dy))
        {
            steps=Math.abs(dx);
        }
        else
        {
            steps=Math.abs(dy);
        }
        x=x0;
        y=y0;
        g.fillOval((int)x,(int)y,5,5);
        Xinc=dx/steps;
        Yinc=dy/steps;
        for(int k=1;k<=steps;k++)
        {
            x+=Xinc;
            y+=Yinc;
              g.fillOval((int)x,(int)y,5,5);
        }


    }
    public void breLine(Graphics g,int x0,int y0,int x1,int y1)
    {
        int dx,dy,p,x,y,Inc1,Inc2;
           dx=x1-x0;
           dy=y1-y0;
           p=2*dy-dx;
           Inc1=2*dy;
           Inc2=2*dy-2*dx;
           x=x0;
           y=y0;
           while(x<x1)
           {
              if(p>=0)
              {
                y+=1;
                p+=Inc2;
                g.fillOval((int)x, (int)y, 5, 5);
              }
              else
              {
                p+=Inc1;
                g.fillOval((int)x, (int)y, 5, 5);
              }
              x++;
           }
         
    }
    public void MidCircle(Graphics g,int r,int k,int h)
    {
        int x=0;
        int y=r;
        int p=1-r;
        while(x<=y)
        {
            g.fillOval((x+k),(y+h),5,5);
            g.fillOval((y+k),(x+h),5,5);
              g.fillOval((x+k),(-y+h),5,5);
            g.fillOval((y+k),(-x+h),5,5);
              g.fillOval((-x+k),(-y+h),5,5);
            g.fillOval((-y+k),(-x+h),5,5);
              g.fillOval((-x+k),(y+h),5,5);
            g.fillOval((-y+k),(x+h),5,5);
            if(p<0)
            {
                p+=2*x+3;
            }
            else
            {
                p+=2*(x-y)+5;
                y--;
            }
            x++;
        }
    }
         public void BreCircle(Graphics g,int r,int k,int h)
    {
        int x=0;
        int y=r;
        int p=3-2*r;
        while(x<=y)
        {
            g.fillOval((x+k),(y+h),5,5);
            g.fillOval((y+k),(x+h),5,5);
              g.fillOval((x+k),(-y+h),5,5);
            g.fillOval((y+k),(-x+h),5,5);
              g.fillOval((-x+k),(-y+h),5,5);
            g.fillOval((-y+k),(-x+h),5,5);
              g.fillOval((-x+k),(y+h),5,5);
            g.fillOval((-y+k),(x+h),5,5);
            if(p<0)
            {
                p+=4*x+6;
            }
            else
            {
                p+=4*(x-y)+10;
                y--;
            }
            x++;
        }
    }
    public void paint(Graphics g)
    {
        Center();
       // MidCircle(g, 70,centerX-250,centerY-250);
        Line(g, centerX-250,centerY-200,centerX+400,centerY+400);

        
    }
   
}
