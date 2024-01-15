import java.util.*;

public class ddaLine{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1:");
		int x1=sc.nextInt();
		
		System.out.println("Enter y1:");
		int y1=sc.nextInt();
		
		System.out.println("Enter x2:");
		int x2=sc.nextInt();
		
		System.out.println("Enter y2:");
		int y2=sc.nextInt();
		
		double dx=x2-x1;
		double dy=y2-y1;
		
		 double x=0;
		 double y=0;
		 double steps=0;
		 if (Math.abs(dx)>Math.abs(dy)){
			 steps=Math.abs(dx);
		 }
		 else{
			 steps=Math.abs(dy);
		 }
		 x=x1;
		 y=y1;
		 System.out.println("Put pixel--> x="+(int)x+",y="+(int)y);
		 double xinc=dx/steps;
		 double yinc=dy/steps;
		 
		 for(int k=1;k<=steps;k++){
			 x=x+xinc;
			 y=y+yinc;
			  System.out.println("Put pixel--> x="+(int)x+",y="+(int)y);
		 }
		
		 
	}
}