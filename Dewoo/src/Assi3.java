// Using Switch Case:

import java.util.Scanner;

public class Assi3 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: 1:ONE, 2:TWO, 3:THREE, 4:FOUR, 5:FIVE, 6:SIX, 7:SEVEN, 8:EIGHT, 9:NINE. ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
			
			
		}
	}
}


/*
// Using Nested Loop
import java.util.Scanner;

public class Assi3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if(num==1)
			System.out.println("ONE");
		else if (num==2)
		System.out.println("TWO");
		
		else if (num==3)
			System.out.println("THREE");
		
		else if (num==4)
			System.out.println("FOUR");
		
		else if (num==5)
			System.out.println("FIVE");
		
		
		else if (num==6)
			System.out.println("SIX");
		
		
		else if (num==7)
			System.out.println("SEVEN");
		
		else if (num==8)
			System.out.println("EIGHT");
		
		else if (num==9)
			System.out.println("NINE");
		else
			System.out.println("OTHER");
		

	}

}

*/
