import java.util.Scanner;
public class Calc{

	public static void main(String args[]){
	
		int a=9; int b=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose 1. Addition 2.Subtraction 3.Multiplication 4.Division");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Your additon is " + (a+b));
				break;
			case 2:
				System.out.println("Your subtraction is " + (a-b));
				break;
			case 3:
				System.out.println("Your additon is " + (a*b));
				break;
			case 4:
				System.out.println("Your additon is " + (a-b));
				break;		
	
		}


	}



}
