import java.io.*;
import java.util.*;
class Grade
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks obtained");
int g = sc.nextInt();
if(g >=90)
{
System.out.println("Grade obtained is "+'O');
}
else if(g>=80&&g<90)
{
System.out.println("Grade obtained is "+"A+");
}
else if(g>=70&&g<80)
{
System.out.println("Grade obtained is "+'A');
}
else if(g>=60&&g<70)
{
System.out.println("Grade obtained is "+"B+");
}
else if(g>=50&&g<60)
{
System.out.println("Grade obtained is "+'B');
}
else if(g>=40&&g<50)
{
System.out.println("Grade obtained is "+'C');
}
else
{
System.out.println("FAIL");
}
}
}