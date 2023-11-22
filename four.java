import java.util.Scanner;
class four{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Input an Year: ");
	int a=sc.nextInt();
	float month=a*12;
	System.out.println("Months are: " + month);
	float days=month*30;
	System.out.println("Days are: " + days);
	}
}