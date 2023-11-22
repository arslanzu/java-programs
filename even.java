import java.util.Scanner;
class even{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a number (n): ");
		 int even=sc.nextInt();
		 System.out.println("Even numbers up to " + even + ":");
		for(int i=0; i<=even; i+=2){
			System.out.println(i+" ");
		}
	}
}