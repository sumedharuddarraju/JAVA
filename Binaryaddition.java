import java.io.*;
import java.util.*;
class Binaryaddition
{
public static void main(String args[])
{
	int[] sum =new int[10];
	int i=0,c=0;
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	int b=sc.nextInt();
	while(a!=0||b!=0)
	{
		sum[i++]=(a%10+b%10+c)%2;
		c=(a%10+b%10+c)/2;
		a/=10;
		b/=10;
	}
if(c!=0)
sum[i]=c;

while(i>=0)
{
	System.out.print(sum[i--]);
}
}
}