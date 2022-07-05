//Java Program to make a calculator using switch case
import java.io.*;
import java.util.*;
class Calculator
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Which operation you want to perform");
char c = sc.next().charAt(0);

System.out.println("Enter two numbers for performing Operation");
int a = sc.nextInt();
int b = sc.nextInt();

switch(c)
{
case '+':{

System.out.println("Result after performing addition "+(a+b));
} 
break;
case '-':{
System.out.println("Result after performing Subtraction "+(a-b));
}
break;

case '*':{
System.out.println("Result after performing Multiplication         "+(a*b));
}
break;

case '/':{
System.out.println("Result after performing Division "+(a/b));
}
break;

case '%':{
System.out.println("Result ->Remainder "+(a%b));
}
break;
default :
{
System.out.println("Enter a valid operand");}
break;
}
}
}