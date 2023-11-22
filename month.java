import java.util.Scanner;
class month{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter the Number of month: ");
	int mno=sc.nextInt();
	if(mno>=1&&mno<=12){
    String monthName;
	switch(mno){
		case 1:
		monthName="January";
		break;
		case 2:
		monthName="Febraray";
		break;
		case 3:
		monthName="March";
		break;
		case 4:
		monthName="April";
		break;
		case 5:
		monthName="May";
		break;
		case 6:
		monthName="jun";
		break;
		case 7:
		monthName="July";
		break;
		case 8:
		monthName="August";
		break;
		case 9:
		monthName="September";
		break;
		case 10:
		monthName="October";
		break;
		case 11:
		monthName="NOvember";
		break;
		case 12:
		monthName="December";
		break;
		default:
		System.out.println("Enter a valid number");
	
	}
System.out.println("Month: " + monthName);
	}else{
System.out.println("Invalid month number. Please enter a number between 1 and 12.");
	}
	}
}