import java.io.*;
interface A
{
        void display();
}
interface B
{
        void display();
}

class AB implements A,B
{
        public void display()
        {
                System.out.println(" DISPLAY");
        }
       
}
public class MultipleInheritance
{
        public static void main(String args[])
        {
                AB obj=new AB();
                obj.display();
        }
}