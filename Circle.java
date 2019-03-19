// import Math.PI;
import java.util.Scanner;
public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	public static double diameter(double radius){
		return 2*radius;
	}
	// public static double diameter(double x,double y){
	// 	// the radius is calculating from the origin, i.e (0,0)
	// 	return 2*Math.sqrt(x*x+y*y);
	// }
	public static double circumference(double dia){
		return dia*Math.PI;
	}
	public static double area(double dia){
		double r=dia/2.0;
        return Math.PI*r*r;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		

		System.out.println("enter diameter of the circle");
		double radius=scan.nextInt();
		System.out.println("the diameter is: "+diameter(radius));
		System.out.println("the circumference of the circle: "+circumference(diameter(radius)));
		System.out.println("the area of the circle: "+area(diameter(radius)));

		
		
	}
}
