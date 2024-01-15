import java.util.*;

public class bresenhemLine{
	
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the x1 coordinate:");
	int x1=sc.nextInt();
	
	System.out.println("Enter the y1 coordinate:");
	int y1=sc.nextInt();
	
	System.out.println("Enter the x2 coordinate:");
	int x2=sc.nextInt();
	
	System.out.println("Enter the y2 coordinate:");
	int y2=sc.nextInt();
	
	double dx=x2-x1;
	double dy=y2-y1;
	double d=(2*dy)-dx;
	double inc1=2*dy;
	double inc2=(2*dy)-(2*dx);
	
	int x=0;
	int y=0;
	int xend=0;
	
	if(x2>x1){
		x=x1;
		y=y1;
		xend=x2;
	}
	else{
		x=x2;
		y=y2;
		xend=x1;
	}
	
	System.out.println("put pixel--> x="+(int)x+",y="+(int)y);
	
	for(x=x+1;x<=xend;x++){
		if(d<0){
			d=d+inc1;
			
		}
		else{
			d=d+inc2;
			y=y+1;
		}
		System.out.println("put pixel--> x="+(int)x+",y="+(int)y);
	}
	
	
}
}