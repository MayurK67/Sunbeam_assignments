package Que3;

import java.util.Scanner;



class Employee
{
	private String name;
	private int year;
	private int salary;
	Scanner sc = new Scanner(System.in);
	public void get_Data()
	{
		System.out.println("Name:");
		name=sc.next();
		System.out.println("Year of Joining");
		year=sc.nextInt();
		System.out.println("Salary");
		salary=sc.nextInt();
		
	}
	public void put_Data()
	{
		System.out.println("Name: "+name+" Year: "+year+" Salary"+salary);
	}
}
public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[] = new Employee[10];//array
		for(int i=0;i<10;i++)
		{
			e[i]=new Employee();//object is created
			e[i].get_Data();
		}
		for(int i=0;i<10;i++)
		{
			e[i].put_Data();
		}
	}

}
