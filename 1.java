import java.util.Scanner;
class 1{
	public static void main (String[] args){
	System.out.print("Enter First Number: ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();	
	System.out.print("Enter Second Number: ");
	int b=sc.nextInt();	
	int add=a+b;
	int sub=a-b;
	int div=a/b;
	int mul=a*b;
	int modulus=a%b;
	System.out.println("Addition of first and second number is: "+ add);
	System.out.println("Multiplication of first and second number is: "+ mul);
	System.out.println("Division of first and second number is: "+div);
	System.out.println("Modulus of first and second number is: "+ modulus);
	System.out.println("Subtraction of first and second number is: "+ sub);
	
	}
}