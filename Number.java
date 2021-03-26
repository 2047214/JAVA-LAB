import java.io.*;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" ----------------------------------------------------------------------------------------- ");
		while(true){
			System.out.println("Print ODD Numbers from 1 to 50? Enter 1");
			System.out.println("Print EVEN Numbers from 1 to 50? Enter 2");
			System.out.println("Exit, Enter 3");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("ODD Numbers from 1 - 50");
			odd();
			break;
			case 2: System.out.println("EVEN Numbers from 1 - 50");
			even();
			break;
			case 3: System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("INCORRECT INPUT! ENTER A CORRECT INPUT.");
			}
		}

	}
public static void odd(){
		for (int i = 1; i <= 50; i++)
			{
	   		if (i % 2 != 0)
				{
				System.out.print(i + " ");
	   			}
			}

}
public static void even()
{
for (int i = 1; i <= 50; i++)
	{
	if (i % 2 == 0)
		{
			System.out.print(i + " ");
	   	}
	}

}
}