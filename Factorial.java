import java.io.*;
import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int factorial =fact(num);
		System.out.println("Factorial of entered Number is " +factorial);
	}
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
}