package Que4;

import java.util.Scanner;


public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
int sum=0;
int count=0;
int num=0;
char ch;
int pro=1;
do
{
	count++;
	System.out.println("Enter the Number");
	num= sc.nextInt();
	sum=sum+num;
	pro=pro*num;
	System.out.println("Press q to Quit");
	ch=sc.next().charAt(0);;
}while(ch!='q');
int av = sum/count;
System.out.println("Average: "+av);
System.out.println("Product: "+pro);
	}

}
