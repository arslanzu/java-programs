import java.util.Scanner;
class second{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the radius of the circle: ");
	double radius=sc.nextDouble();
	double circumference=2*3.14*radius;
	double area=3.14*radius*radius;
	System.out.println("Radius "+radius);
	System.out.println("circumference: "+circumference);
	System.out.println("Area: "+area);
	}
}