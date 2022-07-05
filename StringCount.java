//Java program to find occurrence of a character in a String

public class StringCount
{
	public static void main(String args[])
	{
		String str="aaabbcdea";
		char c='a';
		int i,count=0;
		for(i=0 ;  i<str.length()  ; i++)
		{
			if(str.charAt(i) == c)
			{
				count++;
			}
		}
		System.out.println("Char : " +c+  "     Count  :  " + count);
	}
}