import java.util.Scanner;
class five{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("input temp in celcius: ");
	float a=sc.nextInt();
	float f=(a*9/5)+32;
	System.out.print("temperature in fehrenheit is: "+f+"f");
	}
}