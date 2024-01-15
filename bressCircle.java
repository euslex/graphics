import java.util.*;

public class bressCircle{
	
	public static void drawCircle(int h, int k, int r){
		
		int x=0;
		int y=r;
		int p=3-2*r;
		
		while(x<=y){
			plotpoints(x,y,h,k);
			
			if(p<0){
				p=p+4*x+6;
			}
			else{
				p=p+4*(x-y)+10;
				y--;
			}
			plotpoints(x,y,h,k);
		}
	}
	
	private static void plotpoints(int x,int y, int h, int k){
		
		System.out.println("("+(x+h)+","+(y+k)+")");
		System.out.println("("+(x+h)+","+(y-k)+")");
		System.out.println("("+(x-h)+","+(y+k)+")");
		System.out.println("("+(x-h)+","+(y-k)+")");
		System.out.println("("+(y+h)+","+(x+k)+")");
		System.out.println("("+(y-h)+","+(x+k)+")");
		System.out.println("("+(y+h)+","+(x-k)+")");
		System.out.println("("+(y-h)+","+(x-k)+")");
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the centerX value:");
		int centerX=sc.nextInt();
		
		System.out.println("Enter the centerY value:");
		int centerY=sc.nextInt();
		
		System.out.println("Enter the radius value:");
		int radius=sc.nextInt();
		
		System.out.println("Center:"+centerX+","+centerY);
		System.out.println("Radius"+radius);
		System.out.println("Coordinates");
		
		drawCircle(centerX,centerY,radius);
		
	}
}