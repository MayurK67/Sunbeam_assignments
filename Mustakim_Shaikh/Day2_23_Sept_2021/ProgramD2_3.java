package SunbeamAssignments;
import java.util.*;

public class ProgramD2_3{

	public static void main(String[] args){
	
	 Scanner sm = new Scanner(System.in);
	 System.out.println("Enter Your Marks: ");
	 int marks = sm.nextInt();

   System.out.println("Obtained Marks is: " + marks);

    char grade = 'g' ;

   if(marks <= 25) {
	  grade = 'F';
   }
   
else if(marks > 25 && marks<= 45) {
	grade = 'E';
}
   
else if(marks > 45 && marks<= 50) {
	grade = 'D';
}
   
else if(marks > 50 && marks<= 60) {
	grade = 'C';
}
   
else if(marks > 60 && marks<= 80) {
	grade = 'B';
}
   
else if(marks > 80) {
	grade = 'A';
}

         System.out.println("Grade is: " + grade);

 }
	
}
	
	