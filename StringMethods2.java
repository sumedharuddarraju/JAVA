import java.lang.String;
public class StringMethods2
{
public static void main(String args[] )
{
/* length() method */
String s1="HelloWorld";
System.out.println("length of  "+s1+" is "+s1.length());

/* cancatenation */
String s2="Software";
String s3="Testing";
System.out.println("s2+s3  = "+(s2+s3));
System.out.println(s2.concat(s3));

/* charAt() method */
String s4="Java Programming";
System.out.println("charAt(0) in Java Programming is "+s4.charAt(0));
System.out.println("charAt(2) in Java Programming is "+s4.charAt(2));

/*  Java String toUpperCase() and toLowerCase() method  */
String s25="Sachin";    
System.out.println(s25.toUpperCase());//SACHIN    
System.out.println(s25.toLowerCase());//sachin    


/*Java String trim() method */
String s30="  Sachin  ";    
System.out.println(s30.trim());//Sachin  

/*  Java String startsWith() and endsWith() method  */
String s8="Sachin";    
 System.out.println(s8.startsWith("Sa"));//true    
 System.out.println(s8.endsWith("n"));//true  
 System.out.println(s8.endsWith("a"));//true  
 

 
 
/* contains() method */
String str="Software Testing";
String str1="Testing";
String str2="blog";
System.out.println("Testing is part of Software Testing : "+str.contains(str1));
System.out.println("blog is part of Software Testing : "+str.contains(str2));

/* split() method */
String s9="The website is software testing";
String[] split=s9.split(" ");
System.out.println("After split() method ");
for(String obj:split)
{
System.out.println(obj);
}

/* replace() method */
String s6="Shot";
String replace=s6.replace('o','u');
System.out.println("After replacement "+replace);

/*  substring() method  */
String s7="HelloWorld";
System.out.println(s7.substring(0,5));

/* String to CharArray() method */
String str3="Hello";
char[] chars = str3.toCharArray();
System.out.println("After String to CharArray() method :");
for (int i= 0; i< chars.length; i++)
System.out.println(chars[i]);

/*  compareTo()method  */
String str11 = "Zeus";
String str12 = "Chinese";
String str13 = "American";
String str14 = "Indian";
System.out.println(str11.compareTo(str12));
          //C comes 23 positions before Z, so it will give you 23
System.out.println(str13.compareTo(str14));
          // I comes 8 positions after A, so it will give you -8


/*Java String indexOf() */
String str7 = "Hello" + "World";
System.out.println("The string is "+str7);
System.out.println("index of 'H' is " + str7.indexOf('H'));
System.out.println("index of 'o' is " + str7.indexOf('o'));
System.out.println("last index of 'd' is " + str7.lastIndexOf('d'));
System.out.println("last index of 'o' is " + str7.lastIndexOf('o'));

}
}
