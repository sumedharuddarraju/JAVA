import java.io.*;
import java.lang.*;
class ReverseWordString
{
public static void main(String args[])
{
int i;
String S = "WELCOME TO JAVA";
String str[] = S.split(" ");
for(i=str.length-1;i>=0;i--)
{
System.out.print(str[i]+" ");
}
}
}