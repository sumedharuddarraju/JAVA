import java.io.*;
class Palindrome
{
	public static void main(String args[])
	{
		int i;
		String S = new String("RADAR");
		char ch;
		String rev = "";
for(i=S.length()-1;i>=0;i--)
		{
			ch = S.charAt(i);
			rev = rev+ch;
		}
/*
		for(i=0;i<S.length();i++)
		{
			ch = S.charAt(i);
			rev = ch+rev;
		}
*/
		System.out.println(rev);

		if(S.compareTo(rev)==0)
		System.out.println("IT IS A PALINDROME");
		else
		System.out.println("IT IS NOT A PALINDROME");
	}
}