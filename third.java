import java.util.Scanner;
class third{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println("Table of number "+num+": ");
	for(int i=1; i<=10; i++){
		int result=num*i;
 System.out.println(num + " * " + i + " = " + result);
	}
	}
}